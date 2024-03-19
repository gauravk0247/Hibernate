package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Flight_Table")
public class Flight1 {
@Id
@SequenceGenerator(name="seq_gen",initialValue=8000,allocationSize=1)
@GeneratedValue(generator="seq_gen",strategy=GenerationType.SEQUENCE)
@Column(name="flight_no")
private long flightNumber;
@Column(name="flight_source")
private String flightSource;
@Column(name="flight_dest")
private String flightDestination;
@Column(name="flight_date")
private LocalDate flightDate;
@ManyToMany(cascade=CascadeType.PERSIST)
@JoinTable(name = "flight_airport_table",
joinColumns = {@JoinColumn(name="flight_id")},
inverseJoinColumns = {@JoinColumn(name="airport_id")})
private List<AirPort1> airports=new ArrayList();
public long getFlightNumber() {
return flightNumber;
}
public void setFlightNumber(long flightNumber) {
this.flightNumber = flightNumber;
}
public String getFlightSource() {
return flightSource;
}
public void setFlightSource(String flightSource) {
this.flightSource = flightSource;
}
public String getFlightDestination() {
return flightDestination;
}
public void setFlightDestination(String flightDestination) {
this.flightDestination = flightDestination;
}
public LocalDate getFlightDate() {
return flightDate;
}
public void setFlightDate(LocalDate flightDate) {
this.flightDate = flightDate;
}
public List<AirPort1> getAirports() {
return airports;
}
public void setAirports(List<AirPort1> airports) {
this.airports = airports;
}
}
