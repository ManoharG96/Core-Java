package com.dxctechnology.assignmetbook;

public class BookStore {

	public static void main(String[] args) {

		Book book = new Book("b098", "Munna", "novel", "comdet", 123f);
		Book book1 = new Book("B065", "Reddy", "story", "fiction", 234f);
		BookDatabase database = new BookDatabase();

		database.addBook(book);
		database.addBook(book1);
		System.out.println();
		
		database.displayBooks();
		System.out.println();
		
		database.searchByTitile("comdet");
		System.out.println();
		
		database.searchByAuthor("Reddy");
		System.out.println();
		
		
	}
}
