package icu.yunke.byapi.common.web.base;

import lombok.Data;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:07
 * @description: 接口统一返回类
 */
@Data
public class Result<T> {

    private static final int SUCCESS_CODE = 0;
    private static final int ERROR_CODE = 1;
    private static final String SUCCESS_MSG = "success";
    private static final String ERROR_MSG = "failed";

    private int code;

    private String msg;

    private T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(String msg) {
        return new Result<>(SUCCESS_CODE, msg, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(SUCCESS_CODE, msg, data);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(ERROR_CODE, msg, null);
    }

    public static <T> Result<T> fail(T data) {
        return new Result<>(ERROR_CODE, ERROR_MSG, data);
    }

    public static <T> Result<T> fail(String msg, T data) {
        return new Result<>(ERROR_CODE, msg, data);
    }
}
