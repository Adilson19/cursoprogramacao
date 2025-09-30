package entities;
public class ProductConstructor {
    
    public String name;
    public double price;
    public int quantity;
    
    //  Construtor padrao
    public ProductConstructor(){
        
    }
    
    //  Construtor
    public ProductConstructor(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    //  Construtor opcional
    public ProductConstructor(String name, double price){
        this.name = name;
        this.price = price;
        // Opcional o valor 0 e a palavra this
        //this.quantity = 0;
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
    
    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
