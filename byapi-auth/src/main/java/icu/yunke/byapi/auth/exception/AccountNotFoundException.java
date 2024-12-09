package icu.yunke.byapi.auth.exception;

import icu.yunke.byapi.common.exception.BizException;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:24
 * @description: 账号未找到异常
 */
public class AccountNotFoundException extends BizException {

    public AccountNotFoundException() {
        super("账号未找到");
    }
}
