package com.wipro;

public class Author {

	private int authorId;
	private String authorName;
	private String email;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName, String email) {
		super();
		this.authorName = authorName;
		this.email = email;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", email=" + email + "]";
	}
	
}
