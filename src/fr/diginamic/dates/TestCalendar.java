package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar
{

	public static void main(String[] args)
	{
		var calendar = Calendar.getInstance();
		calendar.set(2016, 5, 19, 23, 59, 30);
		var date = calendar.getTime();
		var format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println(format.format(date));
		
		for (var language : new Locale[] { Locale.FRANCE, new Locale("ru", "RU"), Locale.CHINA })
		{
			var formatFull = new SimpleDateFormat("EEEE MMMM yyyy HH:mm:ss", language);
			
			System.out.println(formatFull.format(date));
		}
	}

}
