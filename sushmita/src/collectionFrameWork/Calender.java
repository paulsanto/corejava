package collectionFrameWork;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;

public class Calender {

	public static void main(String[] args) {
		//Calendar c = Calendar.getInstance();
		//System.out.println(c.getCalendarType());
		
		//System.out.println(c.getTimeZone());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.getTime());
		System.out.println(c.getWeeksInWeekYear());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" +c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(cal.isLeapYear(2023));


	}

}
