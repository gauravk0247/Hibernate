package inheritance.demos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="My_Emp")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee1 {
   
	@Id
    @GeneratedValue
	private long empId;
	private String empName;
	@OneToOne(cascade = CascadeType.PERSIST)
	private EmpAddress address;
    private long empPhone;
	public Employee1(String empName, EmpAddress address, long empPhone) {
		super();
		
		this.empName = empName;
		this.address = address;
		this.empPhone = empPhone;
	}
	
	 public long getEmpId() {
			return empId;
		}
		public String getEmpName() {
			return empName;
		}
		public EmpAddress getAddress() {
			return address;
		}
		public long getEmpPhone() {
			return empPhone;
		}
	
}