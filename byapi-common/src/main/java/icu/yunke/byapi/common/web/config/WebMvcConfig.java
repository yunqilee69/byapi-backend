package icu.yunke.byapi.common.web.config;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.same.SaSameUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/10 16:27
 * @description web配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // 注册 Sa-Token 全局过滤器
    @Bean
    public SaServletFilter getSaServletFilter() {

        return new SaServletFilter()
                .addInclude("/**")
                // 登录、获取验证码
                .addExclude("/login", "/captcha")
                // springdoc相关
                .addExclude("/swagger-resources/**", "/webjars/**", "/v3/**", "/swagger-ui.html/**", "/swagger-ui/**")
                // druid相关
                .addExclude("/druid/**")
                .setAuth(obj -> {
                    String token = SaHolder.getRequest().getHeader(SaSameUtil.SAME_TOKEN);
                    SaSameUtil.checkToken(token);
                });
    }
}
