package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates
{

	public static void main(String[] args)
	{
		var date = new Date();
		var format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(format.format(date));
		
		var date2 = new Date(2016, 05, 19, 23, 59, 30);
		System.out.println(format.format(date2));
	}

}
