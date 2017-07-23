package com.bobby.peng.transaction.problem.domain.entity;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class User {

    private long userId;

    private String name;

    private String desc;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
