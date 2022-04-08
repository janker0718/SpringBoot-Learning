package top.janker.exp05.knife4jv3.model.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @date: 2022/4/8 8:28 下午
 */

@Data
public class UserParam {

    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
}
