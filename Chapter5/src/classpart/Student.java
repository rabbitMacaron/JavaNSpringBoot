package classpart;

public class Student {
	
	// public- > ����������
	// new Studet�� �ν��Ͻ� ���� ��, heap �޸𸮿� ��������� studentId, studentName, address�� ������.
	// �޼���� heap�� �ƴ� �ٸ� ������ ������...

	private int studentId;
	//private -> �� Ŭ���� ���ο����� ���� ����. �ܺο��� �����Ұ� 
	public String studentName;
	public String address;
	
	
	// ������ ������ �ִ� �� -> �����ε�
	// ���� �̸��� �޼���, ������������ �Ű������� �ٸ� ���,, > �����ε�
	/*	// ����Ʈ ������
		public Student() {}*/
	
	public Student(String name) {
		studentName=name;
	}
	
	// ������
	public Student(int id, String name) {
		studentId = id;	// private������, �� Ŭ�������� �ʱ�ȭ �����Ƿ� �ʱ�ȭ �ȴ�!
		studentName = name;
		address = "�ּ� ����";
	}
		
	
	// ��������� ���������� �ٸ���.
	
	// �޼���(�Լ��� ����)
	// void -> ��ȯ�ϴ� �����Ͱ�.�ڷ���
	// showStudentInfo -> �޼����̸�, ()�� �� �� ���� ����
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	// main~
	
	//��ü�� ���� �Ӽ� �� �����Ϸ���, ��ü�����ؾ���! ������ ���� �Ϳ� ����� 2������
	//1.main �����ϱ� 2.���ο� class ����
	
	
	
	// ���� �����ϴ� ���� ���� �ڵ�
	// ���� ����ϴ� ���� Ŭ���̾�Ʈ �ڵ� 
	// ����ϴ� �ʿ� �°� �ڵ带 ���� �� �´�
	
	
	public String getStudentName() {
	
		return studentName;
	}
	
	/// �Լ�ȣ�� �߻� -> ���� �޸� ��� -> �Լ� ȣ�� ���� -> �ڵ����� ��ȯ 

	
	/*	public static void main(String[] args) {
			Student studentPark = new Student();
			studentPark.studentName = "������";
			studentPark.showStudentInfo();
			
		}*/
}
