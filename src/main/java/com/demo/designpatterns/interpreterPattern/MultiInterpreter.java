package com.demo.designpatterns.interpreterPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 20:30 2019/1/29
 * @Modified By
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return " * ";
    }
}
