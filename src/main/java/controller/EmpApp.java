package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Address;
import model.Employee;

public class EmpApp {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		System.out.println("Connection Established");
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee Phone");
		long ph = sc.nextLong();
		System.out.println("Enter Employee Salary");
		double salary = sc.nextDouble();
		e1.setEmpId(id);
		e1.setEmpName(name);
		e1.setEmpPhone(ph);
		e1.setEmpSalary(salary);
		// void persist(e1)
		
		Address a1 = new Address(111, 422606, "Chas", "Sinnar", "Nashik", "Maharashtra", "India");
		
		em.persist(e1);
		em.persist(a1);
		et.commit();
	}
}