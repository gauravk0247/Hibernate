package inheritance.demo;

import javax.persistence.EntityManager;

import utility.DBUtil;

public class TestSingleTableDemo {
	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		em.getTransaction().begin();
		
		Admin1 admin = new Admin1(108, "admin", "admin@123");
		Customer1 customer = new Customer1(101, "customer", "customer@123");
		em.persist(admin);
		em.persist(customer);
		em.getTransaction().commit();
	}
}