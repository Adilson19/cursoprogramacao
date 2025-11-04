package entities.enums;

public enum UnidadeTempo {
	SEGUNDO(1.0),
	MINUTO(60.0),
	HORA(3600.0), 
	DIA(86400.0);
	
	private double fatorConversao;
	
	private UnidadeTempo(double fatorConversao) {
		this.fatorConversao = fatorConversao;
	}
	
	public double converterParaSegundos(double valor) {
		return valor * fatorConversao;
	}
}
