package entities;

public class OrderItem {
	public Integer quantity;
	public Double price;
	
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;		
	}
	public Double getPrice() {
		return price;
	}
	Double subTotal = 0.0;
	public Double subTotal(Integer quantity, Double price){		
		return subTotal = this.price * this.quantity;
	}
}
