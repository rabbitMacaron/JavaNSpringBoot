package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
//		Company company = new Company(); <- private�̶� ���Ұ�.. -> �ν��Ͻ� ����� �Ұ�
		Company company1 = Company.getInstance(); // 
		Company company2 = Company.getInstance(); // 
	
		Company company3 = new Company("test");
		
		
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3.getInstance());
		// ���� �� ��ȯ.. -> singletonPattern
		
//		Calendar calendar = new Calendar(); // �����Ұ�..��? �����ؾ��ϴϱ�
		Calendar calendar = Calendar.getInstance();
	}

}
