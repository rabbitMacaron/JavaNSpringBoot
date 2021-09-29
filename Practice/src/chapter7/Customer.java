package chapter7;

public class Customer {
	private int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade="SILVER";
	}
	
	
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade+" 이며, 적립된 보너스 포인트는 "+ bonusPoint+" 점입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerGrade() {
		return customerGrade;
	}



	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
