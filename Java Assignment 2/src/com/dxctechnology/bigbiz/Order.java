package com.dxctechnology.bigbiz;

public class Order {
	private String orderId;
	private String cusName;
	private float orderAmount;
	private String payOption;
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cusName=" + cusName + ", orderAmount=" + orderAmount + ", payOption="
				+ payOption + "]";
	}
	public String getOrderId() {
		return orderId;
	}
	public String getCusName() {
		return cusName;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	public String getPayOption() {
		return payOption;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	public void setPayOption(String payOption) {
		this.payOption = payOption;
	}
	public Order(String orderId, String cusName, float orderAmount, String payOption) throws OrderInvalidException {
		
		this.orderId = orderId;
		this.cusName = cusName;
		if (orderAmount < 1000 ) {
			throw new OrderInvalidException("Order Amount should be more than 1000");
		} else {
			this.orderAmount = orderAmount;
		}
		if (payOption.equals("COD") || payOption.equals("Gift Card") || payOption.equals("Internet banking")) {
		this.payOption = payOption;
		} else {
			throw new OrderInvalidException("Please select proper method of payment");
		}
		
	}

}
