package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("cireport")
@TableName(value = "cireport", resultMap = "cireportRM")
public class CiReport {

    @TableId
    private Integer cirId;

    private Integer ciId;

    private String ciName;

    private Integer orderId;

    @TableField(exist = false)
    private List<CiDetailedReport> ciDetailedReports;
}
