package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		
		//Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum()); //1001, static�� Ŭ�����̸�.~~���� ���� �� ����
		//static ������ �ν��Ͻ��� ���x
		//SerialNum++ <- �ۿ��� ++ �� �� ������ public���� ����� �ȵǰ� private ��� ����..
		
		
		/*Student studentKim = new Student("Kim");
		System.out.println(Student.serialNum); //1002	 
		System.out.println(Student.serialNum); //1002  	-> Kim.serial ��� �� ����.. ���� �޸� ���� ��..
		
		
		
		System.out.println(studentLee.getStudentName()+"�� �й�: "+studentLee.getStudentId());
		System.out.println(studentKim.getStudentName()+"�� �й�: "+studentKim.getStudentId());
		
		*/
	
	
	}
}
