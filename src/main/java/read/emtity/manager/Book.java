package read.emtity.manager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {
	@Id
	private long isbnNum;
	private String bookName;
	private double bookPrice;
	public long getIsbnNum() {
		return isbnNum;
	}
	public void setIsbnNum(long isbnNum) {
		this.isbnNum = isbnNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	

}