package top.janker.exp07.shardingjdbc.mybatis.tables.dao;

import org.apache.ibatis.annotations.*;
import top.janker.exp07.shardingjdbc.mybatis.tables.entity.BizLog;

/**
 * @date: 2022/4/22 9:13 下午
 */
@Mapper
public interface IBizLogDao {

    String SELECT_BIZ_LOG_SQL = "select u.id, u.biz_id, u.log_id, u.status, u.data,  u.create_time, u.update_time from tb_biz_log_0 u";

    @Insert({"<script> ", "insert into tb_biz_log(\n" +
            " <if test=\" bizId!= null \">biz_id,</if>\n" +
            " <if test=\"data != null and data != ''\">data,</if>\n" +
            " <if test=\"status != null \">status,</if>\n" +
            " create_time,\n" +
            " update_time\n" +
            " )values(\n" +
            " <if test=\"bizId != null\">#{bizId},</if>\n" +
            " <if test=\"data != null and data != ''\">#{data},</if>\n" +
            " <if test=\"status != null \">#{status},</if>\n" +
            " sysdate(),\n" +
            " sysdate()\n" +
            " )", " </script>"})
    @Options(useGeneratedKeys = true, keyProperty = "logId")
    int save(BizLog bizLog);


    @Update({"<script> ", "update tb_biz_log\n" +
            " <set>\n" +
            " <if test=\"bizId != null \">biz_id = #{bizId},</if>\n" +
            " <if test=\"data != null and data != ''\">data = #{data},</if>\n" +
            " <if test=\"status != null \">status = #{status},</if>\n" +
            " update_time = sysdate()\n" +
            " </set>\n" +
            " where log_id = #{logId}", " </script>"})
    int update(BizLog bizLog);

    @Results(
            id = "UserResult",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "bizId", column = "biz_id"),
                    @Result(property = "logId", column = "log_id"),
                    @Result(property = "data", column = "data"),
                    @Result(property = "status", column = "status"),
                    @Result(property = "createTime", column = "create_time"),
                    @Result(property = "updateTime", column = "update_time")
            }
    )
    @Select({SELECT_BIZ_LOG_SQL, " where  biz_id = #{bizId} and log_id = #{logId} "})
    BizLog findByBizIdAndLogId(Long bizId, Long logId);
}
