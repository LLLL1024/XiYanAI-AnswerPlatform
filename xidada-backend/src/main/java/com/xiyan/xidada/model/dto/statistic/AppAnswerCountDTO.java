package com.xiyan.xidada.model.dto.statistic;

import lombok.Data;

/**
 * App 用户提交答案数统计
 */
@Data
public class AppAnswerCountDTO {

    private String appId;

    /**
     * 用户提交答案数
     */
    private Long answerCount;
}