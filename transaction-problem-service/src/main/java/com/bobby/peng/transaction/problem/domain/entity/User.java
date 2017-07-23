package com.bobby.peng.transaction.problem.domain.entity;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class User {

    private long userId;

    private String name;

    private String desc;

    public User() {
    }

    public User(long userId, String name, String desc) {
        this.userId = userId;
        this.name = name;
        this.desc = desc;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
