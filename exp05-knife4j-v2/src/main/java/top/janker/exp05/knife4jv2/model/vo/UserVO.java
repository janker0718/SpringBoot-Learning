package top.janker.exp05.knife4jv2.model.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @date: 2022/4/8 8:29 下午
 */
@Data
@Builder
public class UserVO {
    private Long userId;

    private String userName;
}