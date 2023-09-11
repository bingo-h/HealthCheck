package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("project")
@TableName(value = "setmeal", resultMap = "selectprojectRM")
public class Project {

	@TableId
	private Integer smId;
	
	private String name;
	
	private Integer type;
	
	private Integer price;

	@TableField(exist = false)
	private List<Item> itemList;

}
