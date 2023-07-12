package dateAndTimeAPI;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {

	public static void main(String[] args)
	{
		//Date d=new Date();
		//d.getMonth();
		/*
		 * Date d=new Date(); System.out.println(d.getTime());
		 * System.out.println(d.getYear()+1900);
		 */
		
		/*
		 * GregorianCalendar g= new GregorianCalendar();
		 * System.out.println(g.isLeapYear(2013));
		 * System.out.println(g.get(Calendar.DATE)); //System.out.println(g);
		 * 
		 */	
	//LocalDate date = LocalDate.now();
	//LocalDate date = LocalDate.now(Clock.systemDefaultZone());
	//System.out.println(date);
	
	
	//LocalTime time =LocalTime.now();
	//System.out.println(time);
	//this is immutable, so
	//LocalTime time1=time.minusMinutes(3);
	
	//System.out.println(time1);
		
		//LocalDateTime dt=LocalDateTime.now();
		
		//DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		//System.out.println(df.format(dt));
		 System.out.println(System.getProperty("user.home"));
		 System.out.println(System.getProperty("user.password",
	              "none of your business"));
	
	}
}
