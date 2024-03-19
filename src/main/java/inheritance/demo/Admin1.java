package inheritance.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin1_type")
public class Admin1 extends UserLogin{

	public Admin1(int userId, String userName, String userPassword) {
		super(userId, userName, userPassword);
		// TODO Auto-generated constructor stub
	}
	
}