package com.demo.designpatterns.interpreterPattern;

import java.util.Stack;

/**
 * @Description: 运算器
 * @Author: chujunjie
 * @Date: Create in 20:35 2019/1/29
 * @Modified By
 */
public class MyExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArr = str.split(" ");
        for (String symbol : strItemArr) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈: %d", numberExpression.interpret()));
            } else {
                // 运算符号
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈: %d 和 %d", firstExpression.interpret(),  secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符: %s", operator));
                if (operator != null) {
                    int result = operator.interpret();
                    NumberInterpreter resultExpression = new NumberInterpreter(result);
                    stack.push(resultExpression);
                    System.out.println(String.format("阶段结果入栈: %d",  resultExpression.interpret()));
                }
            }
        }
        return stack.pop().interpret();
    }
}
