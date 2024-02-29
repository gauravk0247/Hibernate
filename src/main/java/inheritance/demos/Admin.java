package inheritance.demos;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//CHAR, STRING, INT, class
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
public class Admin {
	@Id
	private int id;
	private String userName;
	private String userPassword;
	public Admin(int id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}

}