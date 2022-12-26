/**
 * 
 */
package com.Ust.sampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ustjavafsdb411
 *
 */

@Component
public class Order {
	
	@Autowired(required = true)
	@Value("1051")
	private String orderId;
	
	@Autowired(required = true)
	@Value("Laptop")
	private String orderName;
	
	@Autowired(required = true)
	@Value("HYD")
	private String orderLocation;
	
	@Value("35000.00")
	private double orderPrice;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Order() {
		super();
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderLocation=" + orderLocation
				+ ", orderPrice=" + orderPrice + "]";
	}

	
}
