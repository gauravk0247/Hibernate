package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Info")
public class Address {
	@Id
//	@Column(name="house_id")
	private int houseNo;
//	@Column(name="emp_id")
	private long zipCode;
//	@Column(name="emp_id")
	private String city;
//	@Column(name="emp_id")
	private String Taluka;
//	@Column(name="emp_id")
	private String District;
//	@Column(name="emp_id")
	private String state;
//	@Column(name="emp_id")
	private String Country;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		Taluka = taluka;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Address(int houseNo, long zipCode, String city, String taluka, String district, String state,
			String country) {
		super();
		this.houseNo = houseNo;
		this.zipCode = zipCode;
		this.city = city;
		Taluka = taluka;
		District = district;
		this.state = state;
		Country = country;
	}
}