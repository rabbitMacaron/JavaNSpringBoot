package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	
	public Subway(int lineNumber) { //  생성자(constructor)
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {	
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber+"호선 지하철의 승객은 "+ passengerCount+"명이고, 수입은 "+money+" 원입니다.");
	}
}
