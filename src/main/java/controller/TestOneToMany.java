package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Address;
import model.Courses;
import model.Student;
import utility.DBUtil;

public class TestOneToMany {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction transction = em.getTransaction();
		transction.begin();
		Student studentObj = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name = sc.next();
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
		studentObj.setAddress(AddressObj);
		studentObj.setName(name);
		List<Courses> listOfCourse = studentObj.getCourses();
		
		// creating first object of course
		Courses c1 = new Courses();
		c1.setCourseName("java FSD");
		c1.setPrice(1500.00);
		c1.setStudent(studentObj);
		
		// creating second object of course
		Courses c2 = new Courses();
		c2.setCourseName("React Native");
		c2.setPrice(2500.00);
		c2.setStudent(studentObj);
		
		// Adding course objects to list object
		listOfCourse.add(c1);
		listOfCourse.add(c2);
		// setting list of course object with srudent object
		studentObj.setCourses(listOfCourse);
		
		em.persist(studentObj);
		transction.commit();
	}
}