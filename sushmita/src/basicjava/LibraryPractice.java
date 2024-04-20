package basicjava;

class Library{
	String [] books;
	int no_of_books;
	
	Library(){
		this.books = new String[100];
		this.no_of_books = 0;
	}
	
	void addBook(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book+" has been added!");
	}
	
	void showAvailableBooks() {
		System.out.println("Available books are: ");
		for(String s:this.books) {
			if(s== null) {
				continue;
			}
			System.out.println("* "+s);
		}
	}
	
	void issueBook(String book) {
		for(int i=0; i<this.books.length; i++) {
			if(this.books[i] == book) {
				System.out.println("The book has been issued");
				this.books[i]= null;
				return;
			}
		}
		System.out.println("This book does not exist");
	}
	
	void returnBook(String book) {
		addBook(book);
	}
}

public class LibraryPractice {

	public static void main(String[] args) {
		// You have to implement a library using Java class "Library"
		// Methods: addBooks, issueBook, returnBook, showAvailableBooks
		// Properties: Array to store the available books
		// Array to store the issued books
		
		Library library = new Library();
		library.addBook("Think and grow rich ");
		library.addBook("Algorithms");
		library.addBook("C++");
		library.showAvailableBooks();
		library.issueBook("C++");
		library.showAvailableBooks();
		
		library.returnBook("C++");
		library.showAvailableBooks();

	}

}
