package com.bingo.server.po;

public class Order {
	
	private Integer orderId;
	
	private String orderDate;
	
	private String userId;
	
	private Integer hpId;
	
	private Integer smId;
	
	private Integer state;
	
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getHpId() {
		return hpId;
	}

	public void setHpId(Integer hpId) {
		this.hpId = hpId;
	}

	public Integer getSmId() {
		return smId;
	}

	public void setSmId(Integer smId) {
		this.smId = smId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
