package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.FlipKartOrder;
import model.FlipKartProduct;
import utility.DBUtil;

public class TestFlipKartApp {

	public static void main(String[] args) {

//First I have establishing connection with database
	
	EntityManager em=DBUtil.getEntityManager();
EntityTransaction et=	em.getTransaction();	
	et.begin();
	
	FlipKartProduct product1=new FlipKartProduct();
	product1.setProductName("TV");
	
	
	
	FlipKartProduct product2=new FlipKartProduct();
	product2.setProductName("Laptop");
	
	FlipKartOrder order1=new FlipKartOrder();
	order1.setOrderName("TV-ORDER");
	order1.setOrderDate(LocalDate.now());
	
	FlipKartOrder order2=new FlipKartOrder();
	order2.setOrderName("Laptop-ORDER");
	order2.setOrderDate(LocalDate.now());	
	
	order1.addProduct(product1);
	order1.addProduct(product1);
	order2.addProduct(product2);
	
	product1.addOrders(order1);
	product1.addOrders(order1);
    product2.addOrders(order2);		
em.persist(order1);
em.persist(order2);
et.commit();
	}

}