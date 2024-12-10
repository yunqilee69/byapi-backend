package icu.yunke.byapi.common.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author yunqilee
 * @version 1.0
 * @data 2024/12/10 15:05
 * @description id实体类，只包含id
 */
@Data
public class IDEntity {

    @TableId
    private Long id;
}
