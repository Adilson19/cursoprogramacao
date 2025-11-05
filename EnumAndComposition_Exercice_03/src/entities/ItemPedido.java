package entities;


public class ItemPedido {
	private Integer quantity;
	private Product product;
	
	public ItemPedido(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public Double subTotal() {
		return  quantity * product.getPrice();
	}
	
	public String toString() {
		return product.getName()
				+", R$ " + String.format("%.2f", product.getPrice())
				+", Qtd: " + quantity
				+ ", Subtotal: R$ " + String.format("%.2f", subTotal());		
	}
}
