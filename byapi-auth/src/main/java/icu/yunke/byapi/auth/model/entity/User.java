package icu.yunke.byapi.auth.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:24
 * @description: 用户实体
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 名称
     */
    private String name;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别：1-男性，0-女性
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色：admin-管理员，user-用户
     */
    private String role;

    /**
     * 余额
     */
    private Long amount;

    /**
     * 总花费
     */
    private Long totalCost;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}