package controller;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import utility.DBUtil;
import model.AirPort1;
import model.Flight1;

public class FlightManyToMany {

public static void main(String[] args) {
	EntityManager em = DBUtil.getEntityManager();
	em.getTransaction().begin();

Flight1 flight1=new Flight1();
flight1.setFlightSource("Kolkata");
flight1.setFlightDestination("Pune");
flight1.setFlightDate(LocalDate.now());

Flight1 flight2=new Flight1();
flight2.setFlightSource("Kolkata");
flight2.setFlightDestination("Pune");
flight2.setFlightDate(LocalDate.now());

AirPort1 airport1=new AirPort1();
airport1.setAirportName("pune airport");

AirPort1 airport2=new AirPort1();
airport1.setAirportName("kolkata airport");

List<Flight1>listofflight=airport1.getFlights();
listofflight.add(flight1);
listofflight.add(flight2);

List<Flight1>listofflight2=airport2.getFlights();
listofflight2.add(flight1);

List<AirPort1>listofAirport1=flight1.getAirports();
listofAirport1.add(airport1);
List<AirPort1>listofAirport2=flight2.getAirports();
listofAirport1.add(airport1);
listofAirport1.add(airport2);

flight1.setAirports(listofAirport2);
flight2.setAirports(listofAirport1);

airport1.setFlights(listofflight2);
airport2.setFlights(listofflight);

em.persist(flight1);
em.persist(flight2);

em.getTransaction().commit();

}

}