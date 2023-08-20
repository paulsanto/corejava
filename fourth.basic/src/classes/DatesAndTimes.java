package classes;
import java.util.*;

public class DatesAndTimes {

	public static void main(String[] args) {
		//Calendar now = new GregorianCalendar();
		Calendar now= Calendar.getInstance();// 7,8 nos lines implies are same meaning
		
		
		//now.setTimeInMillis(10);
		//System.out.println(now.getTimeInMillis());
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1 +"."+now.get(Calendar.DAY_OF_MONTH)+"."+now.get(Calendar.YEAR));
		System.out.println(now.getTime());

	}

}
