package inheritance.demo;

import javax.persistence.Entity;

@Entity
public class Trainer25 extends Emp25{
	private String trainerSkill;
	private int emp;
	public Trainer25(long empId, String empName, double salary, long phone, EmpAddress25 address, String trainerSkill,
			int emp) {
		super(empId, empName, salary, phone, address);
		this.trainerSkill = trainerSkill;
		this.emp = emp;
	}
}