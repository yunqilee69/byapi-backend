package icu.yunke.byapi.auth.mapper;

import icu.yunke.byapi.auth.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024-12-08 23:06:19
 * @description 针对表【user】的数据库操作Mapper
 * @Entity icu.yunke.byapi.auth.model.entity.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




