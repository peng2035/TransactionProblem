package com.bobby.peng.transaction.problem.common;

import java.io.Serializable;

/**
 * Created by peng2035 on 2017/7/23.
 */
public class CommonResponse<T> implements Serializable {
    private static final long serialVersionUID = 42165824138779978L;
    private int code;
    private String message;
    private T data;

    public CommonResponse() {
        this.code = MessageCodeConstants.SUCCESS.intValue();
    }

    public CommonResponse(int code) {
        this.code = MessageCodeConstants.SUCCESS.intValue();
        this.code = code;
    }

    public CommonResponse(int code, String message, T data) {
        this.code = MessageCodeConstants.SUCCESS.intValue();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResponse(int code, String message) {
        this.code = MessageCodeConstants.SUCCESS.intValue();
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
