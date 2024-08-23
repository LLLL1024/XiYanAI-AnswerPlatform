package com.xiyan.xidada.model.dto.userAnswer;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建用户答案请求
 *
 * @author <a href="https://github.com/LLLL1024">程序员兮颜</a>
 
 */
@Data
public class UserAnswerAddRequest implements Serializable {

    /**
     * id（用户答案id，用于保证答案提交的幂等性）
     */
    private Long id;


    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 用户答案（JSON 数组）
     */
    private List<String> choices;

    private static final long serialVersionUID = 1L;
}