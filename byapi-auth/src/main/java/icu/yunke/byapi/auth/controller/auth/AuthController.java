package icu.yunke.byapi.auth.controller.auth;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import icu.yunke.byapi.common.web.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024-12-08 23:06:19
 * @description 用户接口
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public Result<String> login(String username, String password) {
        if (!("admin".equals(username) && "123456".equals(password))) {
           return Result.fail("登录失败");
        }
        // 第1步，先登录上
        StpUtil.login(1L);
        // 第2步，获取 Token  相关参数
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return Result.success(tokenInfo.tokenValue);
    }

    @GetMapping("/isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }
}
