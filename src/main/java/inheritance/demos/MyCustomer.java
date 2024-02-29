package inheritance.demos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("customer")
public class MyCustomer extends User {

	public MyCustomer(int id, String userName, String userPassword) {
		super(id, userName, userPassword);
	}
}