package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("order")
@TableName("orders")
public class Order {

	@TableId
	private Integer orderId;
	
	private String orderDate;
	
	private String userId;
	
	private Integer hpId;
	
	private Integer smId;
	
	private Integer state;

	private Hospital hospital;

	private Project project;
}
