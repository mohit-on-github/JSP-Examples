package com.wipro;

public class Book {

	private int bookId;
	private String title;
	private String publisher;
	private String isbn;
	private int authorId;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String publisher, String isbn, int authorId) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.authorId = authorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + ", isbn=" + isbn
				+ ", authorId=" + authorId + "]";
	}
}
