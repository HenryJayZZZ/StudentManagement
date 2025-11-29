package com.example.demo.utils;

public class Result<T> {

    private int code;       // 状态码
    private String message; // 消息
    private T data;         // 数据

    public Result() {}

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 成功返回
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    // 成功返回并自定义消息
    public static <T> Result<T> success(T data, String message) {
        return new Result<>(200, message, data);
    }

    // 失败返回
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }

    // Getter & Setter
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}
