package inheritance;

public class VIPCustomer extends Customer { // customer ���
//	private int customer;   <- customer�� �����ϱ� ����
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	
	/** ���������� **/
	// public   			�ܺ�/����/����Ŭ����,������Ű��
	// protected			����/����Ŭ����, ������Ű��
	// ��������������(default)	����Ŭ����, ������Ű��
	// private				���� Ŭ����
	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		//super(); // ���������ʾƵ� �����ڵ��ܰ迡�� �ڵ�������..  
		// this�� �ڱ��ڽ��� �޸𸮸� ����Ŵ, super�� ���� Ŭ������ �޸� ��ġ.. �������� ������ �ִ�.
		// super()���� ���� Ŭ������ defualt constructor�� ȣ����...!
		
		// customer�� ����Ʈ ������ ���� ��, �Ű����� ������.. super(�Ű�����) ������Ѵ�. 
		customerGrade = "VIP";  // < privat�� �ٷ� ���ٺҰ�.. ����ص� �ȵ�! protected�� ���� 
		bonusRatio = 0.05; // ����
		salesRatio = 0.1; // ����
		
		
		System.out.println("VIPCustomer() ������ ȣ��");
		}
*/


	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); //�����ȣ���ʿ���.. customer�� �⺻������x 
		
		
		customerGrade = "VIP";  // < privat�� �ٷ� ���ٺҰ�.. ����ص� �ȵ�! protected�� ���� 
		bonusRatio = 0.05; // ����
		salesRatio = 0.1; // ����
		
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}


	// �����ε�  : �޼������ ������ �Ű������� �ٸ� ��. ������ �����ε�, �޼��� �����ε�
	// �������̵� : ������. ����ٴ� �ǹ�. �̹� ������ �ڵ尡 �����ϴµ� �ٸ� �ڵ�� �籸���ϴ� ��
		
	
	// annotation, �����Ϸ����� �������̵��� �޼����� �� �˷��ִ� ������ ��, ������ ������ ������ �� ����
	@Override
	public int calPrice(int price) {
		
		bonusPoint += price*bonusRatio;
		return price-(int)(price * salesRatio);
	}
	
	

	
	
}
