package model.exceptions;

//Classe responsavel por tratar os erros
public class idadeInvalidaError extends Exception{
	private static final long serialVersionUID = 1L;
	
	public idadeInvalidaError(String mensagem) {
		super(mensagem);
	}

}
