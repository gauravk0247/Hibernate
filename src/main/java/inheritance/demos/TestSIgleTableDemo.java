package inheritance.demos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import utility.DBUtil;
/*
 * 1.EntityTrasaction getTransaction();
 * 2.void persist(Object obj)
 * 
 * For entity Transaction
 * i)void commit()
 * ii)void begin()
 * 
 * 
 */


public class TestSIgleTableDemo {

	public static void main(String[] args) {
EntityManager em=DBUtil.getEntityManager();		
EntityTransaction et=em.getTransaction();
et.begin();
Admin adminObj=new Admin(108,"Ritesh Sir","cyber@123");
MyCustomer custObj=new MyCustomer(110,"ABC","customer@123");
em.persist(adminObj);
em.persist(custObj);
et.commit();


	}

}