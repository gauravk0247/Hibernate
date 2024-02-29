package inheritance.demos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpAddress {

	@Id

	private long pinCode;
	private String cityName;
	private String countryName;
	private int st_no;
	public EmpAddress(long pinCode, String cityName, String countryName, int st_no) {
		super();
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.countryName = countryName;
		this.st_no = st_no;
	}
	public long getPinCode() {
		return pinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public int getSt_no() {
		return st_no;
	}
	
	
	
}