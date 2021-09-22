package staticex;

public class Company {

	private static Company instance = new Company(); // company타입의 변수
	
	private Company() {} //외부에서 접근 불가한 생성자
	
	// 내가 test 해본 거~
	public Company(String msg) {
		System.out.println(msg);
	}
	public static Company getInstance() { // 외부에서 인스턴스 생성과 상관없이 호출할 수 있게끔 static붙임. static변수와 상관없음
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
