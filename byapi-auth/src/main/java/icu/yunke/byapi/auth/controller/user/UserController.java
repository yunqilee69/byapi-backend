package icu.yunke.byapi.auth.controller.user;

import icu.yunke.byapi.common.web.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 23:10
 * @description: 用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 获取用户
     * @param id
     * @return
     */
    @GetMapping
    public Result<String> getOne(Long id) {
        return Result.success(id.toString());
    }



}
