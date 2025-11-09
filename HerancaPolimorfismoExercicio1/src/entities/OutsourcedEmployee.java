package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = aditionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
}
