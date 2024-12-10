package icu.yunke.byapi.common.mybatisplus;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/10 15:24
 * @description 实体字段自动填充
 */
@Component
public class EntityAutoFill implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 设置属性值
        this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        long userId = StpUtil.getLoginIdAsLong();
        this.setFieldValByName("createBy", userId, metaObject);
        this.setFieldValByName("updateBy", userId, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 设置属性值
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        long userId = StpUtil.getLoginIdAsLong();
        this.setFieldValByName("createBy", userId, metaObject);
        this.setFieldValByName("updateBy", userId, metaObject);
    }
}
