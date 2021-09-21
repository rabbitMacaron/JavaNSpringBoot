package classpart;

public class StudentTest {
	// student class 메서드 가져다쓸거임
	// 웹서버로 올릴 경우, main 필요x
	public static void main(String[] args) {
		
		//studentLee -> 참조변수
		Student studentLee = new Student(); // 학생을 생성한다.. -> 메모리에 생성된다.
		studentLee.studentName = "이순신";
		studentLee.address= "서울";
		
		studentLee.showStudentInfo();
		
	}

}
