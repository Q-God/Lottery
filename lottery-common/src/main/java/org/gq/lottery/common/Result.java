package org.gq.lottery.common;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

/**
 * 统一返回对象中 status码，message信息，data数据，timestamp时间戳
 *
 * @param <T>
 */
public class Result<T> implements Serializable {


    private static final long serialVersionUID = 7694575148067949619L;

    //定义返回状态码
    private final String status;

    //定义返回消息
    private final String message;

    //定义返回数据
    private final T data;

    //定义当前时间戳
    private final long timestamp;

    public Result(Builder<? extends T> builder) {
        this.status = builder.status;
        this.message = builder.message;
        this.data = builder.data;
        this.timestamp = builder.timestamp;
    }

    private final static class Builder<T> {
        //定义返回状态码
        private String status;

        //定义返回消息
        private String message;

        //定义返回数据
        private T data;

        //定义当前时间戳
        private long timestamp;

        public Builder(String status) {
            this.status = status;
            this.timestamp = System.currentTimeMillis();
        }

        public Builder<? extends T> message(String val) {
            this.message = val;
            return this;
        }

        public Builder<? extends T> data(T val) {
            this.data = val;
            return this;
        }

        public Result<? extends T> build() {
            return new Result<T>(this);
        }
    }

    public static <T> Result<? extends T> ok() {
        return Result.ok(Constants.ResponseCode.SUCCESS.getCode(), null);
    }

    public static <T> Result<? extends T> ok(String status, T data) {
        return Result.ok(status, data, null);
    }

    public static <T> Result<? extends T> ok(String status, T data, String message) {
        return new Builder<T>(status).data(data).message(message).build();
    }

    public static <T> Result<? extends T> fail() {
        return Result.ok(Constants.ResponseCode.UN_ERROR.getCode(), null);
    }

    public static <T> Result<? extends T> fail(String status, T data) {
        return Result.ok(status, data, null);
    }

    public static <T> Result<? extends T> fail(String status, T data, String message) {
        return new Builder<T>(status).data(data).message(message).build();
    }

}
