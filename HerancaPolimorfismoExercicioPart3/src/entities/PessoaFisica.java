package entities;
public class PessoaFisica extends Pessoa{
	
	public Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public Double pagarImposto() {
		
		if(getRendaAnual() < 20000.00) {
			return 15.0;
		}else if(gastosComSaude > 0.0){
			return gastosComSaude * 50.0;
		}else {
			return 25.0;
		}
	}
}
