package inheritance.demos;

import javax.persistence.Entity;

@Entity
public class Developer extends Employee1 {
 private String projectName;
 private String location;
 private String clients;
public Developer(String empName, EmpAddress address, long empPhone, String projectName, String location,
		String clients) {
	super(empName, address, empPhone);
	this.projectName = projectName;
	this.location = location;
	this.clients = clients;
}
public String getProjectName() {
	return projectName;
}
public String getLocation() {
	return location;
}
public String getClients(){
	return clients;
}
}