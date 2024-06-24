package list.search;

public class Book {
	private String title;
	private String author; 
	private int publishedYear;
	
	public Book(String title, String author, int publishedYear) {
		super();
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publishedYear=" + publishedYear + "]";
	}
	
	

}
