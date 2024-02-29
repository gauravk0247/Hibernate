package inheritance.demos;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee1 {

	private String teamCode;

	public Manager(String empName, EmpAddress address, long empPhone, String teamCode) {
		super(empName, address, empPhone);
		this.teamCode = teamCode;
	}

	public String getTeamCode() {
		return teamCode;
	}
	
	
}