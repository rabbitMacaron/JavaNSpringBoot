package constructor;

public class StudentTest {
	// student class 메서드 가져다쓸거임
	// 웹서버로 올릴 경우, main 필요x
	
	
	public static void main(String[] args) {
		
		//studentLee -> 참조변수 
		// new Student() <- 인스턴스, 인스턴스 생성하면 heap 메모리에 생성됨
		Student studentLee = new Student("이순신"); // 학생을 생성한다.. -> 메모리에 생성된다.
//		studentLee.studentName = "이순신";
		studentLee.address= "서울";
		
		studentLee.showStudentInfo();
		
		// heap에 있는 객체들은 인스턴스라고 함! 각각의 인스턴스들은 별개의 메모리를 갖는다.
		// studentLee와 studentKim은 별개의 메모리에 생성되어있음! (heap 메모리 내에서)
		Student studentKim = new Student(100,"김유신");
		studentKim.studentName = "김유신";
		//studentKim.address = "경주";
		
		
		studentKim.showStudentInfo();	
		
		
		/*//참조변수 출력 시, 
		//클래스풀네임(패키지 이름이 모두 포함된 클래스이름)@주소값
		//주소값은 실제 피지컬 메모리 값은 아니고 가상 JVM 해쉬코드값. 16진수, 32비트
		System.out.println(studentLee);
		System.out.println(studentKim);*/
		
	}

}
