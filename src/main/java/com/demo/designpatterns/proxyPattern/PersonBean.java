package com.demo.designpatterns.proxyPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 9:43 2018/8/8
 * @Modified By
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int hotOrNotRating);
}
