package top.janker.exp05.knife4jv3.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @date: 2022/4/8 8:29 下午
 */
@Data
@Builder
public class UserVO {

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "用户名")
    private String userName;
}
