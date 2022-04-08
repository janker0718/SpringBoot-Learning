package top.janker.exp03.swagger.v2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.janker.exp03.swagger.v2.model.param.UserParam;
import top.janker.exp03.swagger.v2.model.vo.UserVO;

import java.util.Collections;
import java.util.List;

/**
 * @date: 2022/4/8 8:31 下午
 */
@Api(value = "用户相关接口", tags = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 添加用户
     * @param userParam
     * @return
     */
    @ApiOperation("添加用户")
    @ApiImplicitParam(name = "userParam", type = "body", dataTypeClass = UserParam.class, required = true)
    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody UserParam userParam) {
        return ResponseEntity.ok("success");
    }

    /**
     * 查询用户列表
     * http://localhost:8080/user/list
     *
     * @return list
     */
    @ApiOperation("查询用户列表")
    @GetMapping("list")
    public ResponseEntity<List<UserVO>> list() {
        List<UserVO> userVoList = Collections.singletonList(UserVO.builder().userId(1001L).userName("janker").build());
        return ResponseEntity.ok(userVoList);
    }
}
