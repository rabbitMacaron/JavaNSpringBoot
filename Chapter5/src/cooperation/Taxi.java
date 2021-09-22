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
		System.out.println(carNumber+" 번 택시 승객은 "+ passengerCount+"명이고, 수입은 "+money+" 원입니다.");
	}
}
