package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/*
 * @Entity is a class level annotation 
 * it is represent the class or component as entity component to PersistenceContext object.
 * 
 * @Entity annotation creates a relation or table in databse, based on class name.
 * 
 * every entity must have the unique id by which entity can be identified.
 * 
 * so using @Id annotation we create a unique primary key for a table or a relation.
 * 
 */
@Entity
@Table(name="Emp_Info")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name", nullable = false)
	private String empName;
	@Column(name="emp_phone", unique = true)
	private long empPhone;
	@Column(name="emp_salary")
	private Double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
}