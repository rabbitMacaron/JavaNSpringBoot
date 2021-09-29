package polymorphism;


// ���.. is-a����
// �Ϲ����� ����� ��ü���� ������� ����
// ���� Ŭ���� : �Ϲ����� ���� (ex. ������)
// ���� Ŭ���� : ��ü���� ���� (ex. ���, ������, ��..)

//composition.. has-a����
//student�� subject�� ������ ���� > ex.. ArrayList.. extends�ؼ� ���� �� �ƴϰ� ���� �����ؼ� ���� ��~
public class GoldCustomer extends Customer{
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade="GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price-(int)(price * salesRatio);
	}
}
