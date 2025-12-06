package entities;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(Double balance, Integer accountNumber, Double interestRate) {
		super(balance, accountNumber);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		
	}
}
