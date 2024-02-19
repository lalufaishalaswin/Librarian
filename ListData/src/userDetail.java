import java.sql.Date;

public class userDetail {

	private String noTicket;
	private String bookName;
	private String userName;
	private String phoneNumber;
	private String author;
	private String genre;

	public userDetail(String noTicket, String bookName, String genre, String author , String userName , String phoneNumber) {
		super();
		this.noTicket = noTicket;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.bookName = bookName;
		this.genre = genre;
		this.author = author;
	}

	public String getnoTicket() {
		return noTicket;
	}

	public void setnoTicket(String noTicket) {
		this.noTicket = noTicket;
	}

	public String getBookName() {
		return bookName;
	}

	public void setName(String bookName) {
		this.bookName = bookName;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
