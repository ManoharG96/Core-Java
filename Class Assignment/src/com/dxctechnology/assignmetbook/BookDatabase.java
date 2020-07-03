package com.dxctechnology.assignmetbook;

public class BookDatabase {

	int num = 0;
	Book [] books = new Book[10];

	public void addBook(Book book) {
		if (book!=null)
			books[num] = book;
		num++;
		System.out.println("book added successfully");
	}

	public void displayBooks() {
		for(Book book : books)
			if (book!=null)
				System.out.println(book);
	}

	public void searchByTitile(String title) {
		for (Book book : books) {
			if (book!=null)
				if (book.getTitle().equals(title)) {
					System.out.println("Book is found in database");
					System.out.println(book);
				}
		}
	}

	public void searchByAuthor(String author) {
		for (Book book : books) {
			if (book!=null)
				if (book.getBookName().equals(author)) {
					System.out.println("Book is found in database");
					System.out.println(book);
				}
		}
	}
}
