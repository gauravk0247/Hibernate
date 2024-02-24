package controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Address;
import model.Customer;
import model.Order;
import utility.DBUtil;

public class TestCustomerApp {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name = sc.next();
		System.out.println("Enter Customer Phone");
		long ph = sc.nextLong();
		System.out.println("Enter Customer Email");
		String email = sc.next();
		System.out.println("Enter Address Id");
		int addressId = sc.nextInt();
		System.out.println("Enter Zip Code");
		long zip = sc.nextLong();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter Taluka");
		String tal = sc.next();
		System.out.println("Enter District");
		String dist = sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter Country");
		String cont = sc.next();
		
		Address addObj = new Address(addressId, zip, city, tal, dist, state, cont);
		
		// set all the value with customer object
		customer.setAddress(addObj);
		customer.setCustomerName(name);
		customer.setEmailId(email);
		customer.setPhoneNumber(ph);
		
		Order orderObj = new Order();
		System.out.println("Enter Order Name");
		String oname = sc.next();
		orderObj.setOrderName(oname);
		orderObj.setOrderDate(LocalDate.now());
		
		// set the order object with customer object
		customer.setOrder(orderObj);
		
		// persisit the customer object with entity manager
		em.persist(customer);
		// persist the address object with entity manager
		em.persist(addObj);
		// commit the entities to db
		et.commit();
	}
}