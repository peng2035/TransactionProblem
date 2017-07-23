package com.bobby.peng.transaction.problem.api.dto;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class UserDTO {

    private long userId;

    private String name;

    private String description;

    public UserDTO() {
    }

    public UserDTO(long userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
