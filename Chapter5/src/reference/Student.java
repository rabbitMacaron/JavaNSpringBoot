package reference;

public class Student {

	//�Ӽ��� �������� ��ü�� �� �� �ִ�. -> subject!
	
	int studentId;
	String studentName;
	
	// �����ڷ��� Ÿ���� ����
	//Subject�� Student�� ���� �Ӽ�
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		//subject�� ����ϱ� ���� ���������� ���� �ʿ�..
		korea = new Subject();
		math = new Subject();
	}
	
	// ������� access �ؼ� ���� �پ�
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName=name;
		math.score=score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName+" �л��� ������ "+total+" �� �Դϴ�.");
	}
}