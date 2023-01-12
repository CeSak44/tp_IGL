package tp_igl;

public class Book {
	private String title;

	private String auther;

	private String ISBN;

	private String publisher;

	public Book() {	}

	public Book(String title, String auther, String ISBN, String publisher) {
		this.title = title ;
		this.auther = auther ;
		this.ISBN = ISBN ;
		this.publisher = publisher ;
	}


	public void Resarvation_status() {

	}

	public void Feedback() {

	}

	public void Book_request() {

	}


	public void show_bookinfos() {
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + auther);
		System.out.println("Book ISBN : " + ISBN);
		System.out.println("Book Publisher : " + publisher);
		System.out.println("");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
