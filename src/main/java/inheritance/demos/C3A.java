package inheritance.demos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="3A_COACH")
public class C3A extends Train{

	
	double third_ac_price;

	public C3A(int trainNumber, String trainName, String trainSource, String trainDestination, double third_ac_price) {
		super(trainNumber, trainName, trainSource, trainDestination);
		this.third_ac_price = third_ac_price;
	}
	
	
	
}
