package com.demo.designpatterns.prototypePattern;

import java.text.MessageFormat;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 21:48 2019/1/17
 * @Modified By
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}发送邮件，地址为{1}，内容为{2}";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getAddress(), mail.getContent()));
    }

    public static void saveOrginalMailRecord(Mail mail) {
        System.out.println("存储originalMail记录，originalMail：" + mail.getContent());
    }
}
