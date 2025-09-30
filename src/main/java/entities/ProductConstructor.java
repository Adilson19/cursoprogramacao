package entities;
public class ProductConstructor {
    
    public String name;
    public double price;
    public int quantity;
    
    //  Construtor
    public ProductConstructor(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
}
