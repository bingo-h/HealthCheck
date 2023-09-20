package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("cidetailedreport")
@TableName(value = "cidetailedreport", autoResultMap = true)
public class CiDetailedReport {

    @TableId
    private Integer cidrId;

    private String name;

    private String unit;

    private Double minrange;

    private Double maxrange;

    private String normalValue;

    private String normalValueString;

    private Integer type;

    private String value;

    private Integer isError;

    private Integer ciId;

    private Integer orderId;


}
