package Chapter05.D_Inheritance;

class Book{
	private String title, author;
	private int price;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String gettitle() {
		return title;
	}
	
	String getauthor() {
		return author;
	}
	
	int getprice() {
		return price;
	}
}


class Ebook extends Book{
	private int fileSize;
	
	Ebook(String title, String author, int price, int fileSize){
		super(title, author, price);
		this.fileSize = fileSize;
	}
	
	int getfilesize() {
		return fileSize;
	}
}

public class Z_Practice02 {
	public static void main(String[] args) {
		
		Ebook eb = new Ebook(" a ", " b ", 300, 200);
		System.out.println(eb.gettitle() + eb.getauthor() + eb.getprice() + " " + eb.getfilesize());
		
	}
}
