package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
//		Company company = new Company(); <- private이라 사용불가.. -> 인스턴스 만들기 불가
		Company company1 = Company.getInstance(); // 
		Company company2 = Company.getInstance(); // 
	
		Company company3 = new Company("test");
		
		
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3.getInstance());
		// 같은 값 반환.. -> singletonPattern
		
//		Calendar calendar = new Calendar(); // 생성불가..왜? 유일해야하니까
		Calendar calendar = Calendar.getInstance();
	}

}
