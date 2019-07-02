package com.demo.designpatterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:51 2019/7/2
 * @Modified By
 */
public class AuthorValve extends ValveBase {
    @Override
    public void invoke(Article article) {
        if (null != article) {
            if (StringUtils.isNoneEmpty(article.getAuthor())) {
                System.out.println("该文章含有作者，通过作者校验，作者为" + article.getAuthor());
                // 如果还有valve，继续执行
                if (null != next)
                    next.invoke(article);
            } else {
                System.out.println("该文章没有作者，作者校验不通过");
            }
        }
    }
}
