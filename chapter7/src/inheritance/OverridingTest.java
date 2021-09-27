package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10020, "이순신");
		customerLee.bonusPoint=1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신"); // 상위클래스 타입은 사용가능~~ 묵시적 허용
		customerKim.bonusPoint=10000;
		
		int priceLee = customerLee.calPrice(10000);
		int priceKim = customerKim.calPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo()+" 지불 금액은 "+priceLee +" 원 입니다.");
		System.out.println(customerKim.showCustomerInfo()+" 지불 금액은 "+priceKim +" 원 입니다.");
		
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo()+" 지불 금액은 "+customerNo.calPrice(10000) +" 원 입니다.");  // 가상함수..가상메서드
	}

}
