package com.demo.designpatterns.structural.decorator.IODecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 自定I/O装饰者测试
 * @Author: chujunjie
 * @Date: Create in 17:40 2018/8/4
 * @Modified By
 */
public class IODecoratorTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream inputStream = new ToLowerCaseInputStream(
                                        new BufferedInputStream(
                                                new FileInputStream("test.txt")));
        while ((c = inputStream.read()) >= 0) {
            System.out.print((char) c);
        }

        inputStream.close();
    }
}
