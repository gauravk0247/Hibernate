package inheritance.demo;

import javax.persistence.EntityManager;

import utility.DBUtil;

public class TestJoinedDemo {
	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		em.getTransaction().begin();
		EmpAddress25 address =new EmpAddress25();
		address.setCityName("Pune");
		address.setCountryName("India");
		address.setPinCode(232480);
		Trainer25 t = new Trainer25(101, "Gaurav", 25000.00, 896745, address, "NExtJs",6);
		em.persist(t);
		em.getTransaction().commit();
	}
}