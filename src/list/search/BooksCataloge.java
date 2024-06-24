package list.search;

import java.util.ArrayList;
import java.util.List;

public class BooksCataloge {
	private List<Book> bookList;

	public BooksCataloge() {
		super();
		this.bookList = new ArrayList<>();
	}
	
	public void addBook(String title, String author, int publishedYear) {
		bookList.add(new Book(title,author,publishedYear));
	}
	
	public List<Book> searchByAuthor(String author){
		List<Book> booksByAuthor = new ArrayList<>();
		if(!bookList.isEmpty()){
			for(Book b : bookList) {
				if(b.getAuthor().equalsIgnoreCase(author)){
					booksByAuthor.add(b);		
				}
			}
		}
		return booksByAuthor;
	}
	
	public List<Book> searchByYear(int startYear, int endYear){
		List<Book> booksByYear = new ArrayList<>();
		if(!bookList.isEmpty()){
			for(Book b : bookList) {
				if(b.getPublishedYear() >= startYear && b.getPublishedYear()<= endYear) {
					booksByYear.add(b);				
				}
			}
		}
		return booksByYear;
	}
	
	public Book searchByTitle(String title){
		Book bookByTilte = null;
		if(!bookList.isEmpty()){
			for(Book b : bookList) {
				if(b.getTitle().equalsIgnoreCase(title)) {					
					bookByTilte = b;
					break;
				}
			}
		}
		return bookByTilte;
	}
	
	public static void main(String[] args) {
		BooksCataloge booksCataloge = new BooksCataloge();
		booksCataloge.addBook("Book 1" ,"Author 1", 2020);
		booksCataloge.addBook("Book 1" ,"Author 2", 2022);
		booksCataloge.addBook("Book 3" ,"Author 2", 2001);
		booksCataloge.addBook("Book 4" ,"Author 2", 2005);
		booksCataloge.addBook("Book 5" ,"Author 5", 2012);
		booksCataloge.addBook("Book 6" ,"Author 6", 1997);
		
		System.out.println(booksCataloge.searchByAuthor("author 6"));
		System.out.println(booksCataloge.searchByYear(2015,2021));
		
		System.out.println(booksCataloge.searchByTitle("book 1"));
//		
//		System.out.println(booksCataloge.searchByAuthor("author 2"));
	}
	
	
	
}
