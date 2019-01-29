package com.demo.designpatterns.interpreterPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 20:31 2019/1/29
 * @Modified By
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
