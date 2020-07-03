package com.dxctechnology.assignment2;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*Book book = new Book();



		  System.out.println("Enter the Book id");
		  book.setBookId(scanner.nextInt());

		  System.out.println("Enter the Book name"); 
		  book.setBookName(scanner.next());

		  System.out.println("enter the author name"); 
		  book.setAuthor(scanner.next());

		  System.out.println("enter the book price");
		  book.setPrice(scanner.nextFloat());

		  System.out.println(book);

		  System.out.println();*/

		EnggBook book = new EnggBook();

		System.out.println("Enter the Book id");
		book.setBookId(scanner.nextInt());

		System.out.println("Enter the Book name"); 
		book.setBookName(scanner.next());

		System.out.println("enter the author name"); 
		book.setAuthor(scanner.next());

		System.out.println("enter the book price");
		book.setPrice(scanner.nextFloat());

		System.out.println("enter the book Category");
		book.setCategory(scanner.next());

		System.out.println("Book name: "+book.getBookName());
		System.out.println("Book Id: "+book.getBookId());
		System.out.println("Book category: "+book.getCategory());
		System.out.println("Book Author: "+book.getAuthor());
		System.out.println("Book Price: "+book.getPrice());
	}


}
