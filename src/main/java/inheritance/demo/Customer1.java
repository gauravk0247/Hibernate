package inheritance.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("customer1_type")
public class Customer1 extends UserLogin{

	public Customer1(int userId, String userName, String userPassword) {
		super(userId, userName, userPassword);
		// TODO Auto-generated constructor stub
	}
}