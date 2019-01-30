package com.demo.designpatterns.chainofresponsibilityPattern;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 内容校验
 * @Author: chujunjie
 * @Date: Create in 23:24 2019/1/30
 * @Modified By
 */
public class ContentHandler extends FormHandler {

    @Override
    public void check(Form form) {
        if (StringUtils.isNoneEmpty(form.getContent())) {
            System.out.println("该文章含有内容，通过内容校验，内容为" + form.getContent());
            // 如果还有handler，继续执行
            if (null != handler) {
                handler.check(form);
            }
        } else {
            System.out.println("该文章内容为空，内容校验不通过");
        }
    }
}
