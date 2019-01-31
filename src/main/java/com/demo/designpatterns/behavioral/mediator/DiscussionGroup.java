package com.demo.designpatterns.behavioral.mediator;

import java.util.Date;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:44 2019/1/30
 * @Modified By
 */
public class DiscussionGroup {
    public static void sendMessage(User user, String msg) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + msg);
    }
}
