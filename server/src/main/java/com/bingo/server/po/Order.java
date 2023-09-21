package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.OrderBy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("order")
@TableName(value = "orders", resultMap = "orderRM")
public class Order {

	@TableId
	private Integer orderId;

	private String orderDate;
	
	private String userId;
	
	private Integer hpId;
	
	private Integer smId;
	
	private Integer state;

	@TableField(exist = false)
	private Hospital hospital;

	@TableField(exist = false)
	private Setmeal setmeal;
}
