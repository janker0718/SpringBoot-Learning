package top.janker.exp07.shardingjdbc.mybatis.tables.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.janker.exp07.shardingjdbc.mybatis.tables.entity.BizLog;
import top.janker.exp07.shardingjdbc.mybatis.tables.model.ResponseResult;
import top.janker.exp07.shardingjdbc.mybatis.tables.service.IBizLogService;

/**
 * @date: 2022/4/22 9:44 下午
 */
@RestController
public class BizLogController {
    @Autowired
    private IBizLogService bizLogService;
    @PostMapping("add")
    public ResponseResult<BizLog> add(BizLog bizLog) {
        if (bizLog.getId() == null) {
            bizLogService.save(bizLog);
        } else {
            bizLogService.update(bizLog);
            if (bizLog.getStatus() == 1){

            }
        }
        return ResponseResult.success(bizLogService.findByBizIdAndLogId(bizLog.getBizId(),bizLog.getLogId()));
    }
}
