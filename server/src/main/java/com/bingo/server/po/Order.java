package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("order")
public class Order {
	
	private Integer orderId;
	
	private String orderDate;
	
	private String userId;
	
	private Integer hpId;
	
	private Integer smId;
	
	private Integer state;

	private Hospital hospital;

	private Project project;
}
