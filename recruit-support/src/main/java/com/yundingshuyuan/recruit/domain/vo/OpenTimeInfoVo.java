package com.yundingshuyuan.recruit.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yundingshuyuan.constant.CommonConstant;
import com.yundingshuyuan.recruit.domain.OpenTimeInfo;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 开放面试时间信息 VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AutoMapper(target = OpenTimeInfo.class)
public class OpenTimeInfoVo {
    /**
     * id
     */
    private long id;
    /**
     * 开放起始时间
     */
    @JsonFormat(pattern = CommonConstant.DATE_TIME_FORMAT_YMDHM)
    private LocalDateTime startTime;
    /**
     * 开放结束时间
     */
    @JsonFormat(pattern = CommonConstant.DATE_TIME_FORMAT_YMDHM)
    private LocalDateTime endTime;

    private Integer capacity;

    private Integer reserved;
}
