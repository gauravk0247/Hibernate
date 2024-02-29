package read.emtity.manager;

import java.util.Scanner;

import javax.persistence.EntityManager;

import utility.DBUtil;

public class TestCRUDDemoWithEntityManger {

	public static void main(String[] args) {

EntityManager em=DBUtil.getEntityManager();
 em.getTransaction().begin();
 Book book=new Book();
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the isbn number");
 long no=sc.nextLong();
 System.out.println("enter book name");
 String bname=sc.next();
 System.out.println("enter book price");
 double price=sc.nextDouble();
 book.setIsbnNum(no);
 book.setBookName(bname);
 book.setBookPrice(price);
 em.persist(book);
em.getTransaction().commit(); 

 //I want fetch a book object based on book isbn number
System.out.println("Enter isbn number to find");
long isb=sc.nextLong();
// Object<Entity> find(name of the entity class, primary key value);
 Book b= em.find(Book.class, isb );
System.out.println("book_id: "+" "+b.getIsbnNum()+ " "+"book_name:"+" "+b.getBookName()+" "+"book_price:"+" "+b.getBookPrice());
	}
}