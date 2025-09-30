package entities;
public class ProductConstructor {
    
    //  colocando private nos atributos
    private String name;
    private double price;
    private int quantity;
    
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
    //  Permite que o atributo seja alterado
    public void setName(String name){
        this.name = name;
    }
    
    //  Permite que o atributo seja obtido
    public String getName(){
        return name;
    }
    
    //  Permite acessar o preco
    public double getPrice(){
        return price;
    }
    
    //  Permite alterar o valor do preco
    public void setPrice(double price){
        this.price = price;
    }
    
    //  Permite retornar ou seja acessar a quantity
    public int getQuantity(){
        return quantity;
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
