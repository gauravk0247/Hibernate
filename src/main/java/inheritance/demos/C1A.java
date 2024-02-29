package inheritance.demos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="1A_COACH")
public class C1A extends  Train {
double first_ac_price;

public C1A(int trainNumber, String trainName, String trainSource, String trainDestination, double first_ac_price) {
	super(trainNumber, trainName, trainSource, trainDestination);
	this.first_ac_price = first_ac_price;
}

}
