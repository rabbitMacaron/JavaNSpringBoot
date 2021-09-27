package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10020, "이순신");
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		
		Customer customerKim = new VIPCustomer(10020, "김유신"); // 상위클래스 타입은 사용가능~~ 묵시적 허용
//		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// 상위 = 하위 가능, 하위 = 상위 불가능! >> 상위먼저생성, 그다음 하위생성! 
		// customerLee = customerKim;
		// custmomer type 이냐 vip 타입이냐에 따라 가리킬 수 있는 위치도 다름! customer 는 .sale~ 를 가리키지못함
		
		
		
	}

}
