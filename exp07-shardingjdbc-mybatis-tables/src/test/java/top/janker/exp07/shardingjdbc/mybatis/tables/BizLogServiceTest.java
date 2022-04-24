package top.janker.exp07.shardingjdbc.mybatis.tables;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.janker.exp07.shardingjdbc.mybatis.tables.entity.BizLog;
import top.janker.exp07.shardingjdbc.mybatis.tables.service.IBizLogService;

/**
 * @date: 2022/4/22 10:48 下午
 */
@Slf4j
public class BizLogServiceTest extends BaseUnitTest{
    @Autowired
    private IBizLogService bizLogService;

    @Test
    public void addBizLog(){
        BizLog bizLog = new BizLog();
        bizLog.setBizId(10001L);
        bizLog.setData("data1");
        bizLog.setStatus(1);
        int count = bizLogService.save(bizLog);
        log.info("count:",count);
    }

    @Test
    public void queryBizLog(){
        BizLog bizLog = bizLogService.findByBizIdAndLogId(10001L, 724400675135926272L);
        log.info("bizLog:{}",bizLog);
    }
}
