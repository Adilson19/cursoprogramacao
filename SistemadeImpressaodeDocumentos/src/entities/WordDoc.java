package entities;

public abstract class WordDoc extends Documentos {
	
	@Override
	public abstract String imprimir() {
		return "Imprimindo Word Document em formato padrão";
	}
	
}
