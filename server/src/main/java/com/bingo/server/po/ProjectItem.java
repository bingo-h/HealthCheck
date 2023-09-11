package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Data
@Alias("projectitem")
@TableName(value = "setmealdetailed", resultMap = "projectitemRM")
public class ProjectItem {

	@TableId
	private Integer sdId;
	
	private Integer smId;
	
	private Integer ciId;

	@TableField(exist = false)
	private Item item;
}
