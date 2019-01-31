package com.demo.designpatterns.behavioral.interpreter;

/**
 * @Description: 解释器模式：给定一个语言，定义它语法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 *
 *               应用：JDK Pattern正则解释器
 *                    spring EL表达式 ExpressionParser
 *
 * @Author: chujunjie
 * @Date: Create in 20:21 2019/1/29
 * @Modified By
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        MyExpressionParser expressionParser = new MyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println(result);
    }
}
