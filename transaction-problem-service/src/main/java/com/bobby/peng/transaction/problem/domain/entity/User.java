package com.bobby.peng.transaction.problem.domain.entity;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class User {

    private long userId;

    private String name;

    private String description;

    public User() {
    }

    public User(long userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
