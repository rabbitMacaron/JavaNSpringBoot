package chapter5;

public class StarCoffee {
	int charge;
	
	
	public StarCoffee(int charge) {
		this.charge = charge;
	}
	
	
	public String buy(int money) {
		this.charge += money;
		return "별 다방 아메리카노를 "+charge+"에 구입하였습니다.";
	}
	
	
	/*// 강사님 답
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "별 다방 아메리카노를 구입했습니다";
		}
		else if(money == Menu.STARLATTE) {
			return "별 다방 라떼를 구입했습니다";
		}
		else {
			return null;
		}
	}*/

}
