package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf1.parse("25/06/2018 15:42:07");	
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println(sdf2.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		int minutes = cal.get(Calendar.MINUTE);
		
		d = cal.getTime();

	}

}
