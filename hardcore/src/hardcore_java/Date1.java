package hardcore_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
public static void main(String args[]) {
	Date current_date = new Date();
	
	/*SimpleDateFormat  TimeFormat = new SimpleDateFormat("EEEE");
	String  DAYNAME = TimeFormat.format(current_date);
	
	SimpleDateFormat DayOftheWeekFormat1 = new SimpleDateFormat("dd,yyyy");
	String year = DayOftheWeekFormat1.format(current_date);
	
	SimpleDateFormat DayOftheWeekFormat2 = new SimpleDateFormat("MMMM");
	String month= DayOftheWeekFormat2.format(current_date);
	
	SimpleDateFormat DayOftheWeekFormat3 = new SimpleDateFormat("hh:mm:ss");
	String time= DayOftheWeekFormat3.format(current_date);*/
	
	SimpleDateFormat DayOftheWeekFormat4 = new SimpleDateFormat("EEEE MMMM   dd,yyyy  hh:mm:ss ");
	System.out.println("Current date and time: " + DayOftheWeekFormat4.format(current_date));
	
	
	//System.out.println("Current date and time : "+ DAYNAME +" " + month +" "+ year+ " "+ time);
	   }
	}

