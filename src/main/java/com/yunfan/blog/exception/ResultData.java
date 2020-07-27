package com.yunfan.blog.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fengyurong
 * @date 2020-07-22 17:26
 */
@Data
@AllArgsConstructor
public class ResultData<T> {
    private int code;
    private String message;
    private T data;

    public static ResultData success() {
        return new ResultData(0,"success",new Object());
    }
}
