package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Address;
import model.AirPort;
import model.Flight;
import utility.DBUtil;

public class TestFlight {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction transction = em.getTransaction();
		transction.begin();
		Flight flightObj = new Flight();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Flight Name");
		String name = sc.next();
		System.out.println("Enter Flight Price");
		double price = sc.nextDouble();
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
		
		Address AddressObj = new Address(addressId, zip, city, tal, dist, state, cont);
		flightObj.setAddress(AddressObj);
		
		flightObj.setFlightName(name);
		flightObj.setPrice(price);
		List<AirPort> listOfAirport = flightObj.getAirport();
		
		AirPort a1 = new AirPort();
		a1.setaLocation("Nashik");
		a1.setaName("KignFisher");
		a1.setFlight(flightObj);
		
		listOfAirport.add(a1);
		flightObj.setAirport(listOfAirport);
		em.persist(flightObj);
		transction.commit();
	}
}