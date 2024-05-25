package collectionFrameWork;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		/*System.out.println(System.currentTimeMillis()+" Milliseconds");
		System.out.println(System.currentTimeMillis()/1000+" Seconds");
		System.out.println(System.currentTimeMillis()/1000/3600+" Hours");
		System.out.println(System.currentTimeMillis()/1000/3600/24+" Days");
		System.out.println(System.currentTimeMillis()/1000/3600/24/7+" Weeks");
		System.out.println(System.currentTimeMillis()/1000/3600/24/30+" Months");
		System.out.println(System.currentTimeMillis()/1000/3600/24/365+" Years");
		*/
		
		Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(d.getYear());
		

	}

}
