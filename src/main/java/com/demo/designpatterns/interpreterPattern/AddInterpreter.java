package com.demo.designpatterns.interpreterPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 20:26 2019/1/29
 * @Modified By
 */
public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return " + ";
    }
}
