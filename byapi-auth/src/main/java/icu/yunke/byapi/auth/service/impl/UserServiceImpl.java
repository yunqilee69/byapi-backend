package icu.yunke.byapi.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.yunke.byapi.auth.model.entity.User;
import icu.yunke.byapi.auth.service.UserService;
import icu.yunke.byapi.auth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024-12-08 23:06:19
 * @description 针对表【user】的数据库操作Service实现
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




