package com.yundingshuyuan.recruit.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 申请书表
 * </p>
 *
 * @author cr
 * @since 2023-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("application_photo")
public class ApplicationPhoto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请书id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 申请书保存地址
     */
    private String url;

    /**
     * 与报名信息表id相关联
     */
    private Integer userId;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Boolean deleted;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
