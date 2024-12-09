package icu.yunke.byapi.common.exception;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:07
 * @description: 业务异常类
 */
public class BizException extends RuntimeException {

    public BizException() {
        super();
    }

    public BizException(String msg) {
        super(msg);
    }

    public BizException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
