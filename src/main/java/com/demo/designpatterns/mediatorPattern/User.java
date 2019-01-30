package com.demo.designpatterns.mediatorPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:42 2019/1/30
 * @Modified By
 */
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;

    public void sendMessage(String msg) {
        DiscussionGroup.sendMessage(this, msg);
    }
}
