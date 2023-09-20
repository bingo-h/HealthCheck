package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("setmealdetailed")
@TableName(value = "setmealdetailed", resultMap = "setmealdetailedRM")
public class SetmealDetailed {

	@TableId
	private Integer sdId;
	
	private Integer smId;
	
	private Integer ciId;

	@TableField(exist = false)
	private Item item;
}
