package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="flight_airport")
public class AirPort1 {
@Id
@GeneratedValue
private long airportId;
public long getAirportId() {
return airportId;
}
public void setAirportId(long airportId) {
this.airportId = airportId;
}
public String getAirportName() {
return airportName;
}
public void setAirportName(String airportName) {
this.airportName = airportName;
}
public List<Flight1> getFlights() {
return flights;
}
public void setFlights(List<Flight1> flights) {
this.flights = flights;
}
private String airportName;
@ManyToMany(mappedBy = "airports")
private List<Flight1> flights=new ArrayList();
}
