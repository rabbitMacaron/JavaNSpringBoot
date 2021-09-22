package staticex;

public class Student {

	 
	private static int serialNum = 1000;  //�����Ϳ���.. static����.. (���޸�x)
	//static�� �ۿ��� ������ �� ������ private!
	private int studentId;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
		serialNum++;
		studentId=serialNum;
	}
	
	public Student(int id, String name) {
		studentId = id;	
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentId=serialNum;
	}
		
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	
	public String getStudentName() {
		return studentName;
	}

	
	public int getStudentId() {
		serialNum++;  //�Ϲ� �޼��忡�� static���� ��밡�� -> static������ ���α׷��� �޸𸮿� load�� �� �����Ǳ� ������...
					  //static�� ū �޸� ��������ʱ�... ���α׷��� �ε�Ǵ� ������ ���� �޸� ���� ������
		return studentId;
	}

	public static int getSerialNum() {
		int i=0; // �Լ� �ȿ� ����Ǿ������� ��������... �Լ� ���� ������ ���o
		//studentName = "Lee"; //static�ȿ��� �ν��Ͻ� ���� ���Ұ� ->�ν��Ͻ� ��������ʾƵ� ȣ��� �� �ֱ� ������
		
		return serialNum;	//static����
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	
	
	
}
