package com.dxctechnology.assignmetbook;

public class Book {
	
	private String bookId;
	private String author;
	private String category;
	private String title;
	private float price;
	
	public Book(String bookId, String bookName, String category, String title, float price) {
		this.bookId = bookId;
		this.author = bookName;
		this.category = category;
		this.title = title;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}
	
	public String getBookName() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public float getPrice() {
		return price;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.author = bookName;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", category=" + category + ", title=" + title
				+ ", price=" + price + "]";
	}

}
