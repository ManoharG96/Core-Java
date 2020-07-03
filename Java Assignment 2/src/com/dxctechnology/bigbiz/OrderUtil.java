package com.dxctechnology.bigbiz;

import java.util.ArrayList;

public class OrderUtil {

	ArrayList<Order> orderList = new ArrayList<Order>();
	Order orderSearch = null;
	float total = 0;

	public void addOrder (Order o) {
		if (o!=null) {
			orderList.add(o);
		}
	}

	public Order searchById (String orderId) throws OrderInvalidException {
		for (Order order : orderList) {
			if (order.getOrderId().equals(orderId)){
				orderSearch = order;
			} else
				throw new OrderInvalidException("Please enter the correct order");
		}
		return orderSearch;
	}

	public float totalAmount() {
		for (Order order: orderList) {
			total = total + order.getOrderAmount();
		}
		return total;
	}
}
