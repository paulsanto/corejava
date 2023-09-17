package enums;
import java.time.DayOfWeek;
import java.time.LocalDate;


//Define an enumeration called DayOfWeek
enum DaysOfWeek{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
};


public class DaysLeftInWeek {

	public static void main(String[] args) {
		//get the current day of the week
		DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
		
		//Calculate the number of days left in the week
		int daysLeft = DayOfWeek.SUNDAY.ordinal() - currentDay.ordinal();
		
		//Handle the case when it's already Sunday (0 days left)
		if(daysLeft<0) {
			daysLeft += 7; //Add 7 to wrap around to the next Sunday
		}
		
		// Print the result
		System.out.println("There are "+ daysLeft+" days left in the week, starting from today ("+ currentDay+").");

	}

}
