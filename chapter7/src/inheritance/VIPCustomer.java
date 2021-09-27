package inheritance;

public class VIPCustomer extends Customer { // customer 상속
//	private int customer;   <- customer에 있으니까 빼기
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	
	/** 접근제어자 **/
	// public   			외부/하위/내부클래스,동일패키지
	// protected			하위/내부클래스, 동일패키지
	// 선언되지않은경우(default)	내부클래스, 동일패키지
	// private				내부 클래스
	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		//super(); // 생성하지않아도 프리코딩단계에서 자동생성됨..  
		// this는 자기자신의 메모리를 가리킴, super는 상위 클래스의 메모리 위치.. 참조값을 가지고 있다.
		// super()히면 상위 클래스의 defualt constructor가 호출함...!
		
		// customer에 디폴트 생성자 삭제 후, 매개변수 받으면.. super(매개변수) 해줘야한다. 
		customerGrade = "VIP";  // < privat면 바로 접근불가.. 상속해도 안됨! protected로 변경 
		bonusRatio = 0.05; // 적립
		salesRatio = 0.1; // 할인
		
		
		System.out.println("VIPCustomer() 생성자 호출");
		}
*/


	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); //명시적호출필요함.. customer에 기본생성자x 
		
		
		customerGrade = "VIP";  // < privat면 바로 접근불가.. 상속해도 안됨! protected로 변경 
		bonusRatio = 0.05; // 적립
		salesRatio = 0.1; // 할인
		
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}


	// 오버로딩  : 메서드명은 같은데 매개변수가 다른 거. 생성자 오버로딩, 메서드 오버로딩
	// 오버라이딩 : 재정의. 덮어쓴다는 의미. 이미 구현된 코드가 존재하는데 다른 코드로 재구현하는 것
		
	
	// annotation, 컴파일러한테 오버라이딩된 메서드라는 걸 알려주는 역할을 함, 컴파일 오류를 막아줄 수 있음
	@Override
	public int calPrice(int price) {
		
		bonusPoint += price*bonusRatio;
		return price-(int)(price * salesRatio);
	}
	
	

	
	
}
