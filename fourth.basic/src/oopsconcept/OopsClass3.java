package oopsconcept;

import java.util.*;

class Person {
	public String firstName;
	public String lastName;
	public Calendar birthday;

	public Person(String firstName, String lastName, Calendar birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		// this.birthday.set(birthYear, birthMonth-1, birthDate);

	}

	public String fullName() {
		return firstName + " " + lastName;
	}

	public int age(Calendar today) {
		return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
	}

}

public class OopsClass3 {

	public static void main(String[] args) {
		Person john = new Person("John", "Doe", new GregorianCalendar(1988, 1, 5));

		System.out.println(
				"Hello my name is " + john.fullName() + ". I am " + john.age(Calendar.getInstance()) + " year old.");

	}

}


