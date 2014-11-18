package libraryPackage;

public class Book {
	private String title, author;
	
	public Book(){
		this.title = "none";
		this.author = "none";
	}
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
