package entities;

public class PDF extends Documentos {
	
	@Override
	public String imprimir() {
		return "Imprimindo PDF com alta resolucao";
	}
}
