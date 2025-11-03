package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
	}	
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Date getMoment() {
		return moment;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public OrderStatus getStatus() {
		return status;
	}
	
	public String toString() {
		return "Order [id= " + id + ", moment= " + moment + ", status= " + status + "]";
	}
	
	
}