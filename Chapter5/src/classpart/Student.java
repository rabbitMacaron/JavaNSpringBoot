package classpart;

public class Student {
	
	// public- > 접근제어자
	public int studentId;
	public String studentName;
	public String address;
	
	
	// 멤버변수와 지역변수는 다르다.
	
	
	// 메서드(함수의 일종)
	// void -> 반환하는 데이터값.자료형
	// showStudentInfo -> 메서드이름, ()에 값 들어갈 수도 있음
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	// main~
	
	//객체에 대한 속성 값 대입하려면, 객체생성해야함! 가져다 쓰는 것에 방법이 2가지임
	//1.main 생성하기 2.새로운 class 생성
	
	
	
	// 서비스 제공하는 쪽이 서버 코드
	// 서비스 사용하는 쪽이 클라이언트 코드 
	// 사용하는 쪽에 맞게 코드를 쓰는 게 맞다
	
	
	public String getStudentName() {
	
		return studentName;
	}
	
	/// 함수호출 발생 -> 스택 메모리 사용 -> 함수 호출 종료 -> 자동으로 반환 
	
}
