package pkgLibrary;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Book {

	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	private Date publish_date;
	private String description;
	private double cost;
	//Test

	public Book() {

	}
	
	public Book(Catalog cat, String passedBookId)
	{
		for (Book b: cat.getBooks())
		{
			if(b.getId() == passedBookId)
			{
				this.id = b.id;
				this.author = b.author;
				this.title = b.title;
				this.title = b.title;
				this.genre = b.genre;
				this.price = b.price;
				this.publish_date = b.publish_date;
				this.description = b.description;
				this.cost = b.cost;
			}
		}
	}

	public Book(String id, String author, String title, String genre, double price, Date publish_date,
			String description) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.publish_date = publish_date;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	@XmlElement
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	@XmlElement
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}
	
	@XmlElement
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public ArrayList<Book> addBook(Catalog cat, Book a)
	{
		for(Book b : cat.getBooks())
		{
			if(b == a)
			{
				return cat.getBooks();
			}
		}
		cat.getBooks().add(a);
		return cat.getBooks();
	}
}
