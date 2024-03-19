package inheritance.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cs_emp")
@Inheritance(strategy = InheritanceType.JOINED)
public class Emp25 {
	@Id
	@GeneratedValue
	private long empId;
	private String empName;
	private double salary;
	private long phone;
	@OneToOne(cascade = CascadeType.PERSIST)
	private EmpAddress25 address;
	public Emp25(long empId, String empName, double salary, long phone, EmpAddress25 address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
	}
}