package oopsconcept;

 abstract class Literature{
	protected String title;
	protected String author;
	
  Literature(String title, String author) {
		this.title= title;
		this.author= author;
		
	}
 void print() {
	System.out.println(title);
	System.out.println(author);
}
}
 
 class Book extends Literature{
	private String publisher;
	 private String genre;
	 
	 Book( String title, String author,String publisher, String genre){
		
		 super(title, author);
		 this.publisher= publisher;
		 this.genre= genre;
		 
	 }
	 void print() {
		 super.print();
		 System.out.println("\tPublished by: "+ publisher);
		 System.out.println("\tIs a: "+ genre);
	 }
 }

class Poem extends Literature{
	private String style;
	
	Poem(String title, String author, String style){
		super(title, author);
		this.style= style;
	}
	
	void print() {
		super.print();
		System.out.println("\tIn the style of: "+ style);
	}
}

public class OopsConcept4 {

	public static void main(String[] args) {
		
		/**Literature 1 = new Literature("Java", "Zach");
		Literature[] lits = new Literature[5];
		
		lits[0]= a;
		lits[1]= b;
		lits[2]= l;
		lits[3]= b;
		lits[4]= a;
		for(int i=0; i<lits.length; i++) {
			lits[i].print();
		}**/
		
		Book a = new Book("The Lord of the Rings", "J.R.R. Tolkein", "George Allen and Unwin", "Fantasy");
		a.print();
		
		Poem b = new Poem("The Iliad", "Homer", "Dactylic Hexameter");
		b.print();

	}

}
