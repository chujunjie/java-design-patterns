package com.demo.designpatterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:53 2019/7/2
 * @Modified By
 */
public class ContentValve extends ValveBase {
    @Override
    public void invoke(Article article) {
        if (null != article) {
            if (StringUtils.isNoneEmpty(article.getContent())) {
                System.out.println("该文章含有内容，通过内容校验，内容为" + article.getContent());
                // 如果还有valve，继续执行
                if (null != next)
                    next.invoke(article);
            } else {
                System.out.println("该文章没有内容，内容校验不通过");
            }
        }
    }
}
