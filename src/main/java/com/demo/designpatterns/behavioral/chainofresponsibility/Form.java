package com.demo.designpatterns.behavioral.chainofresponsibility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: form表单
 * @Author: chujunjie
 * @Date: Create in 23:15 2019/1/30
 * @Modified By
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Form {
    private String title;
    private String content;
    private String signature;
}
