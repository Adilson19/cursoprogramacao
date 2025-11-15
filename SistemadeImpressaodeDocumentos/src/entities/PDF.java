package entities;

public abstract class PDF extends Documentos {
	
	@Override
	public abstract String imprimir() {
		return "Imprimindo PDF com alta resolução";
	}
}
