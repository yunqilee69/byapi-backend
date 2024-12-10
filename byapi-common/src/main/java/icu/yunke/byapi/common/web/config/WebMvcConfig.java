package icu.yunke.byapi.common.web.config;

import cn.dev33.satoken.stp.StpUtil;
import icu.yunke.byapi.common.web.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/10 16:27
 * @description TODO
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册Token拦截器，校验规则为 StpUtil.checkLogin() 登录校验。
        registry.addInterceptor(new TokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login");
    }
}
