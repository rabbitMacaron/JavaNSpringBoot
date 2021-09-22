package staticex;

public class Company {

	private static Company instance = new Company(); // companyŸ���� ����
	
	private Company() {} //�ܺο��� ���� �Ұ��� ������
	
	// ���� test �غ� ��~
	public Company(String msg) {
		System.out.println(msg);
	}
	public static Company getInstance() { // �ܺο��� �ν��Ͻ� ������ ������� ȣ���� �� �ְԲ� static����. static������ �������
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
