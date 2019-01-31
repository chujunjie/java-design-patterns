package com.demo.designpatterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 标题校验
 * @Author: chujunjie
 * @Date: Create in 23:18 2019/1/30
 * @Modified By
 */
public class TitleHandler extends FormHandler {

    @Override
    public void check(Form form) {
        if (StringUtils.isNoneEmpty(form.getTitle())) {
            System.out.println("该文章含有标题，通过标题校验，标题为" + form.getTitle());
            // 如果还有handler，继续执行
            if (null != handler) {
                handler.check(form);
            }
        } else {
            System.out.println("该文章没有标题，标题校验不通过");
        }
    }
}
