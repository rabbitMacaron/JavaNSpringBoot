package classpart;

public class Student {
	
	// public- > ����������
	public int studentId;
	public String studentName;
	public String address;
	
	
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
	
}
