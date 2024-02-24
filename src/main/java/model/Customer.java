package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {
	@Id
	// @GeneratedValue generates the value of primary key column
	@GeneratedValue
	private long customerId;
	@Column(name="cust_name")
	private String customerName;
	@Column(name="cust_phone", unique = true)
	private long phoneNumber;
	@Column(name="cust_email", unique= true)
	private String emailId;
	@OneToOne
	@JoinColumn(name="cust_address")
	
	private Address address;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	
	private Order order;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}