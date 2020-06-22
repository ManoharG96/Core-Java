import java.util.Scanner;

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void printBookDetails() {
		System.out.println("Title --- "+title);
		System.out.println("Author --- "+author);
	}
}

public class BookDetailsBasic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the Book title ");
		String title = scn.nextLine();

		System.out.println("Enter the Book Author ");
		String author = scn.nextLine();

		Book book = new Book(title, author);
		book.printBookDetails();

	}

}
