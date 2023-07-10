package Chapter05.B_Method;

class Book2 {
	String title;
	String author;
	int numberOfPages;
	
	Book2(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	static boolean isSameAuthor(Book2 book4, Book2 book5) {
		return book4.author.equals(book5.author);
		
	}
	
}


public class Method_Practice {

	public static void main(String[] args) {
		
		Book2 book1 = new Book2("Book1", "Author1", 300);
		Book2 book2 = new Book2("Book2", "Author2", 250);
		Book2 book3 = new Book2("Book3", "Author3", 100);
		
		System.out.println("book1과 book2는 같은 저자인가요?" + Book2.isSameAuthor(book1, book2));
		System.out.println("book1과 book3는 같은 저자인가요?" + Book2.isSameAuthor(book1, book3));

	}

}
