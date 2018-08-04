package com.demo.designpatterns.decoratorPattern.IODecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 自定义I/O流装饰者，ToLowerCaseInputStream，输入流的大写字母全部转化为小写
 * @Author: chujunjie
 * @Date: Create in 17:31 2018/8/4
 * @Modified By
 */
public class ToLowerCaseInputStream extends FilterInputStream {

    public ToLowerCaseInputStream(InputStream in) {
        super(in);
    }
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
