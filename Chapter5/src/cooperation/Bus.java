package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	// 승차 메서드
	public void take(int money) {  
		this.money += money; // 승객 탑승 시 요금 지불
		passengerCount++;
		
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+ passengerCount+"명이고, 수입은 "+money+" 원입니다.");
	}
}
