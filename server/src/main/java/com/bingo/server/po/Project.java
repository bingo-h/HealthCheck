package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter
@Setter
@Alias("project")
@TableName("setmeal")
public class Project {

	@TableId
	private Integer smId;
	
	private String name;
	
	private Integer type;
	
	private Integer price;

	private List<Item> itemList;

}
