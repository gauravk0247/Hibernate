package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="FK_ORDER")

public class FlipKartOrder {

	@Id
	@GeneratedValue
	private long orderId;
	private String orderName;
	private LocalDate orderDate;
	@ManyToMany(cascade =CascadeType.PERSIST )
	private List<FlipKartProduct>  products=new LinkedList();
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<FlipKartProduct> getProducts() {
		return products;
	}
	public void setProducts(List<FlipKartProduct> products) {
		this.products = products;
	}
	// additional method
	public void addProduct(FlipKartProduct product)
	{
		//this holds the reference of currently running object
		List<FlipKartProduct> list=this.getProducts();
     list.add(product);
	}
	
	
	
}