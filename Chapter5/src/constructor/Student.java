package constructor;

public class Student {

	// ��� ���� ����� ȥ�� ����;; classpart�� ������ ������
	private int studentId;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
	}
	
	public Student(int id, String name) {
		studentId = id;	
		studentName = name;
		address = "�ּ� ����";
	}
		
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
