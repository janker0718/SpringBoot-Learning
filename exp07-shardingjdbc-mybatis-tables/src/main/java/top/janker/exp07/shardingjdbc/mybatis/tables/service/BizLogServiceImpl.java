package top.janker.exp07.shardingjdbc.mybatis.tables.service;

import org.springframework.stereotype.Service;
import top.janker.exp07.shardingjdbc.mybatis.tables.dao.IBizLogDao;
import top.janker.exp07.shardingjdbc.mybatis.tables.entity.BizLog;

/**
 * @date: 2022/4/22 9:36 下午
 */
@Service
public class BizLogServiceImpl implements IBizLogService {
    private final IBizLogDao bizLogDao;

    public BizLogServiceImpl(final IBizLogDao bizLogDao){
        this.bizLogDao = bizLogDao;
    }

    @Override
    public int save(BizLog bizLog) {
        return bizLogDao.save(bizLog);
    }

    @Override
    public int update(BizLog bizLog) {
        return bizLogDao.update(bizLog);
    }

    @Override
    public BizLog findByBizIdAndLogId(Long bizId, Long logId) {
        return bizLogDao.findByBizIdAndLogId(bizId,logId);
    }
}
