package top.janker.exp03.swagger.v2.model.vo;

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
