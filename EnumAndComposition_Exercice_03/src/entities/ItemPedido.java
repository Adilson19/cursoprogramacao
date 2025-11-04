package entities;


public class ItemPedido {
	private Integer quantity;
	private Product product;
	
	
	public Double subTotal() {
		return quantity * product.price;
		
	}
}
