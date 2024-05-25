package collectionFrameWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormat {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now(); // This is the date
		System.out.println(dt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E H:ma"); // This is the format
		String myDate = dt.format(df); // Creating date string using date and format
		System.out.println(myDate);
		
		Calendar cl = Calendar.getInstance();
		
		System.out.println(cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));
		
		Date d = new Date();
		
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
		String myTime = dt.format(dtf);
		System.out.println(myTime);

	}

}
