package inheritance.demos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import utility.DBUtil;

public class TestJoinedTableDemo {

	public static void main(String[] args) {
//setAutoCommit(true)
 EntityManager em=DBUtil.getEntityManager();
 EntityTransaction et=em.getTransaction();
 et.begin();
 EmpAddress addOfDeveloper=new EmpAddress(700030L, "kolkata", "India", 8);
 Developer dev=new Developer("XYZ",addOfDeveloper, 8147117572L, "web project", "Pune", "Cyber Success");
 EmpAddress addOfManager=new EmpAddress(400030L, "Chennai", "India", 18);
 Manager m=new Manager("PQR",addOfManager,224434L,"RT-008");
 em.persist(dev);
 em.persist(m);
 et.commit();
	}
}