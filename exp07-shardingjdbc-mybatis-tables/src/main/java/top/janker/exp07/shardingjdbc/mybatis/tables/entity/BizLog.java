package top.janker.exp07.shardingjdbc.mybatis.tables.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @date: 2022/4/22 9:07 下午
 */
@Getter
@Setter
public class BizLog extends BaseEntity {
    private Long id;

    private Long bizId;

    private Long logId;

    private String data;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    @Override
    public String toString() {
        return "BizLog{" +
                "id=" + id +
                ", bizId=" + bizId +
                ", logId=" + logId +
                ", data='" + data + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
