package src;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		ZonedDateTime meuFuso = ZonedDateTime.now();
		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraSaoPaulo = meuFuso.withZoneSameInstant(saoPaulo);
		ZoneId londres = ZoneId.of("Europe/London");
		ZonedDateTime agoraLondres = meuFuso.withZoneSameInstant(londres);
		
		
		System.out.println("Hora atual (Local): " + meuFuso);
		System.out.println("Hora em São Paulo: " + agoraSaoPaulo);
		System.out.println("Hora em Londres: " + agoraLondres);

	}

}
