package chapter5;

public class BeanCoffee {
	int charge;
	
	
	public BeanCoffee(int charge) {
		this.charge = charge;
	}
	
	
	public String buy(int money) {
		this.charge += money;
		return "�� �ٹ� �󶼸� "+charge+"�� �����Ͽ����ϴ�.";
	}
	
	
	/*// ����� ��
	
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.BEANLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}*/
	
}
