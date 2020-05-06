package com.demo.designpatterns.behavioral.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 价格的有效区间注解，可以给策略添加有效区间的设置
 * @Author: chujunjie
 * @Date: Create in 8:34 2018/8/2
 * @Modified By
 */

@Target(ElementType.TYPE) // 表示该注解只能加在类上
@Retention(RetentionPolicy.RUNTIME) // 表示将注解保留在运行时
public @interface PriceRegion {

    int max() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;
}
