package com.demo.designpatterns.behavioral.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 8:48 2018/8/6
 * @Modified By
 */
public class Coffee extends DrinkWithHook {
    @Override
    void brewing() {
        System.out.println("泡咖啡...");
    }

    @Override
    void pourInCup() {
        System.out.println("把咖啡倒进杯子...");
    }

    @Override
    boolean customerWantsSeasoning() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("您的咖啡需要加牛奶和方糖吗（Y/N）？");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }


}
