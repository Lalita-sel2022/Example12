package WebScreenshot;

import java.util.Date;



public class ScreenshotTimeStemp {

	public static void main(String[] args)
	{
		Date date= new Date();
		System.out.println(date);
		
		//Save file with timeStemp but there not replace method in Date class so we have to convert date object in String object and use replace method
		
		String dt = date.toString().replace(':', '_').replace(' ', '_');
		System.out.println(dt);
		
		

	}

}
