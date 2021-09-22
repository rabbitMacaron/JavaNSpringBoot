package reference;

public class Student {

	//속성이 개별적인 객체로 쓸 수 있다. -> subject!
	
	int studentId;
	String studentName;
	
	// 참조자료형 타입의 변수
	//Subject는 Student에 대한 속성
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		//subject를 사용하기 위해 개별적으로 생성 필요..
		korea = new Subject();
		math = new Subject();
	}
	
	// 멤버변수 access 해서 쓰는 바업
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
		System.out.println(studentName+" 학생의 총점은 "+total+" 점 입니다.");
	}
}