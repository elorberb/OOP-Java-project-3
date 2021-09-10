
public class SalesEmployee extends Employee {
	
	public SalesEmployee(int id, String name, int age, double bonusRate) {// constructor
		super(id, name, age);// using father's constructor
		this.bonusRate = bonusRate;

	}


}
