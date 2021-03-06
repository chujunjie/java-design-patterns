package com.demo.designpatterns.behavioral.strategy;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 使用简单工厂模式优化策略选择
 * 并用单例模式以及反射机制来优化策略选择的代码
 *
 * @author chujunjie
 */
public class CalPriceFactory {

    // 这里是一个常量，表示我们扫描策略的包
    private static final String CAL_PRICE_PACKAGE = "com.demo.designpatterns.behavioral.strategy";

    private ClassLoader classLoader = getClass().getClassLoader();

    // 策略列表
    private List<Class<? extends CalPrice>> calPriceList;

    /**
     * 根据客户的总金额产生相应的策略
     *
     * @param customer customer
     * @return CalPrice
     */
    public CalPrice createCalPrice(Customer customer) {
        for (Class<? extends CalPrice> clazz : calPriceList) {
            // 获取该策略的注解
            PriceRegion validRegion = handleAnnotation(clazz);
            // 判断金额是否在注解区间
            if (null != validRegion
                    && customer.getTotalAmount() > validRegion.min()
                    && customer.getTotalAmount() <= validRegion.max()) {
                try {
                    // 是的话返回一个当前策略的实例
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("策略获取失败");
                }
            }
        }
        throw new RuntimeException("策略获取失败");
    }

    /**
     * 处理注解，传入一个策略类，返回它的注解
     *
     * @param clazz clazz
     * @return PriceRegion
     */
    private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {

        // 通过反射获取策略类的注解
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        // 如果注解为空，则返回null
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        // 如果注解不为空，判断注解是否为PriceRegion，是则返回
        for (Annotation annotation : annotations) {
            if (annotation instanceof PriceRegion) {
                return (PriceRegion) annotation;
            }
        }
        return null;
    }

    /**
     * 在工厂初始化时初始化策略列表
     */
    @SuppressWarnings("unchecked")
    private void init() {
        calPriceList = new ArrayList<>();
        // 获取到包下所有的class文件
        File[] resources = getResources();
        Class<CalPrice> calPriceClazz;
        try {
            // 使用相同的加载器加载策略接口
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("未找到策略接口");
        }
        for (File resource : resources) {
            try {
                // 载入包下的类
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resource.getName().replace(".class", ""));
                // 判断是否是CalPrice的实现类并且不是它本身，满足的话加入到策略列表
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取扫描的包下面所有的class文件
     *
     * @return File[]
     */
    private File[] getResources() {
        try {
            File file = new File(Objects.requireNonNull(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/"))).toURI());
            return file.listFiles(pathname -> {
                // 只扫描class文件
                return pathname.getName().endsWith(".class");
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
    }

    private CalPriceFactory() {
        init();
    }

    // 获取工厂类
    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }
}
