package icu.yunke.byapi.common.web.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/10 16:29
 * @description 校验用户是否登录
 */
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果出现异常直接抛出异常
        StpUtil.checkLogin();
        return true;
    }
}
