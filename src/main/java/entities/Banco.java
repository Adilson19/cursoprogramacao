package entities;
public class Banco {
    protected int accountNumber;
    public String name;
    protected double initialValue;
    protected double depositValue;
    protected double sakeValue;
    protected double accountBalance;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void deposit(){
        depositValue += initialValue;
    }
    
    public void sake(){
        depositValue -= sakeValue - 5.00;
    }
    
    public String toString(){
                return 
                "Account "
                + accountNumber
                + ", "
                + name
                + ", Balance: $ "
                +
                accountBalance;
    }
}
