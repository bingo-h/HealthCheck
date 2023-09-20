package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("itemdetail")
@TableName("checkitemdetailed")
public class ItemDetail {

	@TableId
	private Integer cdId;
	
	private String name;
	
	private String unit;
	
	private Double minrange;
	
	private Double maxrange;
	
	private String normalValue;
	
	private String normalValueString;
	
	private Integer type;

	private Integer ciId;
	
	private String remarks;

}
