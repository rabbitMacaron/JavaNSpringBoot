package chapter7;

public class GoldCustomer extends Customer {
	
	double salesRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.01;
	}
	
	@Override
	public int calPrice(int price) {
		
		bonusPoint += price*bonusRatio;
		return price-(int)(price * salesRatio);
	}

}
