package com.demo.designpatterns.templateMethodPattern;

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
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("您的咖啡需要加牛奶和咖啡吗（Y/N）？");
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
