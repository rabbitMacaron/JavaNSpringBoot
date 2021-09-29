package polymorphism;


// 상속.. is-a관계
// 일반적인 개념과 구체적인 개념과의 관계
// 상위 클래스 : 일반적인 개념 (ex. 포유류)
// 하위 클래스 : 구체적인 개념 (ex. 사람, 원숭이, 고래..)

//composition.. has-a관계
//student가 subject를 포함한 관계 > ex.. ArrayList.. extends해서 쓰는 게 아니고 새로 생성해서 쓰는 거~
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
