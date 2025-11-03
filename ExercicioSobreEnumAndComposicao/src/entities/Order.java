package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	public Date moment;
	public OrderStatus status;
	
	public Order() {
		
	}
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	
}
