package chapter5;

public class StarCoffee {
	int charge;
	
	
	public StarCoffee(int charge) {
		this.charge = charge;
	}
	
	
	public String buy(int money) {
		this.charge += money;
		return "�� �ٹ� �Ƹ޸�ī�븦 "+charge+"�� �����Ͽ����ϴ�.";
	}
	
	
	/*// ����� ��
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.STARLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}*/

}
