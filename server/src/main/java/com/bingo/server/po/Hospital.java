package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("hospital")
@TableName("hospital")
public class Hospital {

	@TableId
	private Integer hpId;
	
	private String name;
	
	private String picture;
	
	private String telephone;
	
	private String address;
	
	private String businessHours;
	
	private String deadline;
	
	private String rule;
	
	private Integer state;
	
}
