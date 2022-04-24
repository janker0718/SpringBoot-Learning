package top.janker.exp07.shardingjdbc.mybatis.tables.service;

import top.janker.exp07.shardingjdbc.mybatis.tables.entity.BizLog;

/**
 * @date: 2022/4/22 9:36 下午
 */
public interface IBizLogService {
    int save(BizLog bizLog);

    int update(BizLog bizLog);

    BizLog findByBizIdAndLogId(Long bizId, Long logId);
}
