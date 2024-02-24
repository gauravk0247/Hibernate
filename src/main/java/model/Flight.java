package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight_info")
public class Flight {
	@Id
	@GeneratedValue
	private int flightId;
	private String flightName;
	private double price;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private Address Address;
	@OneToMany(mappedBy = "flight", cascade = CascadeType.PERSIST)
	private List<AirPort> airport = new ArrayList();
	
	public List<AirPort> getAirport() {
		return airport;
	}
	public void setAirport(List<AirPort> airport) {
		this.airport = airport;
	}
	
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}