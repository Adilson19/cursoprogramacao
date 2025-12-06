package entities;

public class CurrentAccount extends Account {
	private Double additionalCheckLimit;

	
	public CurrentAccount() {
		
	}
	public CurrentAccount(Double balance, Integer accountNumber, Double additionalCheckLimit) {
		super(balance, accountNumber);
		this.additionalCheckLimit = additionalCheckLimit;
	}
	public Double getAdditionalCheckLimit() {
		return additionalCheckLimit;
	}
	public void setAdditionalCheckLimit(Double additionalCheckLimit) {
		this.additionalCheckLimit = additionalCheckLimit;
	}
	
	
	@Override
	public void withdraw() {
		
	}
}
