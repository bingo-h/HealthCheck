package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("projectitem")
@TableName("setmealdetailed")
public class ProjectItem {

	@TableId
	private Integer sdId;
	
	private Integer smId;
	
	private Integer ciId;

	private Item item;
}
