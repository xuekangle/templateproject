package com.lfsxxx.templateproject.utils;

import lombok.Data;

@Data
public class Result {
    private String code;
    private String message;
    private Object data;

    public Result(){}

    public Result(String code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
