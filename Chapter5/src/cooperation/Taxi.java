package cooperation;

public class Taxi {
	int carNumber;
	int passengerCount;
	int money;
	
	
	public Taxi(int carNumber) {
		this.carNumber = carNumber;
	}
	
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(carNumber+" �� �ý� �°��� "+ passengerCount+"���̰�, ������ "+money+" ���Դϴ�.");
	}
}
