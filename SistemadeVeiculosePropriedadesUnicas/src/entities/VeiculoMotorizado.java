package entities;

public class VeiculoMotorizado extends Veiculo {
	
	public VeiculoMotorizado() {
		
	}
	
	public VeiculoMotorizado(String marca, int ano) {
		super(marca, ano);
	}

	public Boolean ligarMotor() {
		return true;
	}
	
	@Override
	public String exibirDetalhes(){
		return getMarca() + " - " + getAno() + " Motor: " + ligarMotor();
	}

}
