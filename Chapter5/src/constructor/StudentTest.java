package constructor;

public class StudentTest {
	// student class �޼��� �����پ�����
	// �������� �ø� ���, main �ʿ�x
	
	
	public static void main(String[] args) {
		
		//studentLee -> �������� 
		// new Student() <- �ν��Ͻ�, �ν��Ͻ� �����ϸ� heap �޸𸮿� ������
		Student studentLee = new Student("�̼���"); // �л��� �����Ѵ�.. -> �޸𸮿� �����ȴ�.
//		studentLee.studentName = "�̼���";
		studentLee.address= "����";
		
		studentLee.showStudentInfo();
		
		// heap�� �ִ� ��ü���� �ν��Ͻ���� ��! ������ �ν��Ͻ����� ������ �޸𸮸� ���´�.
		// studentLee�� studentKim�� ������ �޸𸮿� �����Ǿ�����! (heap �޸� ������)
		Student studentKim = new Student(100,"������");
		studentKim.studentName = "������";
		//studentKim.address = "����";
		
		
		studentKim.showStudentInfo();	
		
		
		/*//�������� ��� ��, 
		//Ŭ����Ǯ����(��Ű�� �̸��� ��� ���Ե� Ŭ�����̸�)@�ּҰ�
		//�ּҰ��� ���� ������ �޸� ���� �ƴϰ� ���� JVM �ؽ��ڵ尪. 16����, 32��Ʈ
		System.out.println(studentLee);
		System.out.println(studentKim);*/
		
	}

}
