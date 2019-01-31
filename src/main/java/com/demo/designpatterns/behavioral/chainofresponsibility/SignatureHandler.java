package com.demo.designpatterns.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 署名校验
 * @Author: chujunjie
 * @Date: Create in 23:25 2019/1/30
 * @Modified By
 */
public class SignatureHandler extends FormHandler {

    @Override
    public void check(Form form) {
        if (StringUtils.isNotEmpty(form.getSignature())) {
            System.out.println("该文章含有签名，通过签名校验，签名为" + form.getSignature());
            // 如果还有handler，继续执行
            if (null != handler) {
                handler.check(form);
            }
        } else {
            System.out.println("该文章没有签名，签名校验不通过");
        }
    }
}
