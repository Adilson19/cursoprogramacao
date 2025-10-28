package entities;

public class Produto {
	//	Atributos
	private String name;
	private Double price;
	private Integer quantity;
	
	public Produto(String name, Double price, Integer quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//	Getters e Setters
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	//	Metodos
	
	public double valorTotalEmStoque(){
		return this.quantity;
	}
	
	public void adicionarProduto(int quantity) {
		this.quantity += quantity;
	}
	
	public void removerProduto(int quantity) {
		this.quantity -= quantity;
	}
	
	
	
}
