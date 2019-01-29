package com.demo.designpatterns.interpreterPattern;

/**
 * @Description: 工具类
 * @Author: chujunjie
 * @Date: Create in 20:37 2019/1/29
 * @Modified By
 */
public class OperatorUtil {

    /**
     * 判断是否为操作符
     *
     * @param symbol
     * @return
     */
    public static boolean isOperator(String symbol) {
        return "+".equals(symbol) || "*".equals(symbol);
    }

    /**
     * 运算操作
     *
     * @param firstExpression
     * @param secondExpression
     * @param symbol
     * @return
     */
    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if ("*".equals(symbol)) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
