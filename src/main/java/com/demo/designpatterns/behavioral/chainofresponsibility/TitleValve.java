package com.demo.designpatterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:49 2019/7/2
 * @Modified By
 */
public class TitleValve extends ValveBase {
    @Override
    public void invoke(Article article) {
        if (null != article) {
            if (StringUtils.isNoneEmpty(article.getTitle())) {
                System.out.println("该文章含有标题，通过标题校验，标题为" + article.getTitle());
                // 如果还有valve，继续执行
                if (null != next)
                    next.invoke(article);
            } else {
                System.out.println("该文章没有标题，标题校验不通过");
            }
        }
    }
}
