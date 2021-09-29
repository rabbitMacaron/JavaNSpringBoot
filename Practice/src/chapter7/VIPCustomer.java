package chapter7;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		this.agentID = agentID;
		
		customerGrade = "VIP";  
		bonusRatio = 0.05;
		salesRatio = 0.1; 
	}

	@Override
	public int calPrice(int price) {
		
		bonusPoint += price*bonusRatio;
		return price-(int)(price * salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo()+" ��� ���� ��ȣ�� "+agentID + "�Դϴ�.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
	
}
