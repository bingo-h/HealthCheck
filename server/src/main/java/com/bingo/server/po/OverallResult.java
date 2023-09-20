package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("overallresult")
@TableName(value = "overallresult", autoResultMap = true)
public class OverallResult {

    @TableId
    private Integer orId;

    private String title;

    private String content;

    private Integer orderId;

}

