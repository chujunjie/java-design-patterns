package com.demo.designpatterns.proxyPattern;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 9:46 2018/8/8
 * @Modified By
 */
public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int hotOrNotRating;
    int ratingCount = 0;

    public PersonBeanImpl(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) return 0;
        return (hotOrNotRating/ratingCount);
    }

    @Override
    public void setHotOrNotRating(int hotOrNotRating) {
        this.hotOrNotRating += hotOrNotRating;
        ratingCount++;
    }

}
