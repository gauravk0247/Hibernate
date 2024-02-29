package inheritance.demos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="2A_COACH")
public class C2A extends Train {
	double second_ac_price;

	public C2A(int trainNumber, String trainName, String trainSource, String trainDestination, double second_ac_price) {
		super(trainNumber, trainName, trainSource, trainDestination);
		this.second_ac_price = second_ac_price;
	}
	
}
