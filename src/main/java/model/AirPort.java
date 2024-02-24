package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="airport_table")
public class AirPort {
	@Id
	private int runWay;
	public int getRunWay() {
		return runWay;
	}
	public void setRunWay(int runWay) {
		this.runWay = runWay;
	}
	@Column(name="air_name")
	private String aName;
	@Column(name="air_location")
	private String aLocation;
	@ManyToOne
	private Flight flight;
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaLocation() {
		return aLocation;
	}
	public void setaLocation(String aLocation) {
		this.aLocation = aLocation;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}