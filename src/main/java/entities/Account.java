package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    //  Construtores
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }
    //  Construtores
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }
    //  Metodos Set e Get
    public int getNumber(){
        return number;
    }
    
    public String getHolder(){
        return holder;
    }
    
    public void setHolder(String holder){
        this.holder = holder;
    }
    
    public double getBalance(){
        return balance;
    }
    //  Metodos Usados
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}

