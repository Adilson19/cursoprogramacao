package entities;
public class Banco {
    private int accountNumber;
    private String name;
    private char response;
    private double initialValue;
    private double depositValue;
    private double sakeValue;
    private double accountBalance;
    
    //  Constructor
    public Banco(int accountNumber, String name, double initialValue){
        this.accountBalance = accountNumber;
        this.name = name;
        if(response == 'y'){
            this.initialValue = initialValue;
        }else{
            this.initialValue = 0;
        }
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
    
    public void setDepositValue(double depositValue){
        this.depositValue = depositValue;
    }
    
    public double getAccountBalance(){
        return accountBalance;
    }
    
    
    //  Metodos usados pelas classes
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
