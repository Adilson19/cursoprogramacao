package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2025-10-19T11:10:10Z"));
		
		System.out.println(sdf.format(d));
		
		//	Acrescentando 4 horas
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//	cal.add(Calendar.HOUR_OF_DAY, 4); - Para adicionar		
		//d = cal.getTime();
		//System.out.println(sdf.format(d)); - retorna o calendario
		
		// Obtendo o valor de minutos e mes de um calendario
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);// + 1 porque os meses comecam contando em zero, colocamos +1 para igualar
		System.out.println("Minutos: " + minutes);
		System.out.println("Month: " + month);
		
		
		

	}

}
