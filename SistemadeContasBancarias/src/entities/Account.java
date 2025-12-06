package entities;

public abstract class Account {
	private Double balance;
	private Integer accountNumber;
	
	
	public Account() {
	}

	public Account(Double balance, Integer accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
}
