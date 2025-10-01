package entities;
public class Banco {
    private int accountNumber;
    private String name;
    private char response;
    private double initialValue;
    //private double depositValue;
    //private double sakeValue;
    private double accountBalance;
    
    //  Constructor
    public Banco(int accountNumber, String name, char response){
        this.accountNumber = accountNumber;
        this.name = name;
        
    }
    
    //  Setando e Getando as variaveis
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void setInitialValue(double initialValue){
        this.initialValue = initialValue;
    }
    
    public double getInitialValue(){
        return initialValue;
    }
    
    public double getAccountBalance(){
        return accountBalance;
    }
    
    /*
    public void setDepositValue(double depositValue){
        this.depositValue = depositValue;
    }*/
    /*
    public double getAccountBalance(){
        return accountBalance;
    }*/
    
    
    //  Metodos usados pelas classes
    public void deposit(double initialValue){
        this.initialValue += initialValue;
        this.accountBalance = this.initialValue;
    }
    
    public void sake(double initialValue){
        this.accountBalance = (this.accountBalance - initialValue) - 5.00;
    }
    /*
    public String toString(){
                return 
                "Account "
                + String.format("%d", accountNumber)
                + ", "
                + String.format(name)
                + ", Balance: $ "
                +
                String.format("%.2f", getAccountBalance());
    }*/
}
