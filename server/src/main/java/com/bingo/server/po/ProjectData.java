package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("checkitemdetailed")
public class ProjectData {

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
