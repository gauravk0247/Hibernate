package inheritance.demos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Train {
	@Id
private int trainNumber;
private String trainName;
private String trainSource;
private String trainDestination;




public Train(int trainNumber, String trainName, String trainSource, String trainDestination) {
	super();
	this.trainNumber = trainNumber;
	this.trainName = trainName;
	this.trainSource = trainSource;
	this.trainDestination = trainDestination;
}
public int getTrainNumber() {
	return trainNumber;
}
public void setTrainNumber(int trainNumber) {
	this.trainNumber = trainNumber;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getTrainSource() {
	return trainSource;
}
public void setTrainSource(String trainSource) {
	this.trainSource = trainSource;
}
public String getTrainDestination() {
	return trainDestination;
}
public void setTrainDestination(String trainDestination) {
	this.trainDestination = trainDestination;
}







}
