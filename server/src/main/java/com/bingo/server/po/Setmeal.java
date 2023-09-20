package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("Setmeal")
@TableName(value = "setmeal", resultMap = "setmealRM")
public class Setmeal {

	@TableId
	private Integer smId;
	
	private String name;
	
	private Integer type;
	
	private Integer price;

	@TableField(exist = false)
	private List<Item> itemList;

}
