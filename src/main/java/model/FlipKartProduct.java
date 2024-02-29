package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FK_Product")
public class FlipKartProduct {
	
	//1,2 3...
	//5000, 5005,5010
	//@Id annotation we can include with field and include setter method
	
@Id
@SequenceGenerator(name = "seq_gen" ,initialValue = 5000, allocationSize =5)
@GeneratedValue(generator = "seq_gen",strategy = GenerationType.SEQUENCE)
private long productId; 
@Column(name="prod_name", nullable = false)
private String productName;
@ManyToMany
private List<FlipKartOrder> orders=new LinkedList();
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public List<FlipKartOrder> getOrders() {
	return orders;
}
public void setOrders(List<FlipKartOrder> orders) {
	this.orders = orders;
}
public void addOrders(FlipKartOrder order)
{
	//this holds the reference of currently running object
	List<FlipKartOrder> list=this.getOrders();
 list.add(order);
}
}