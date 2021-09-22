package classpart;

public class Student {
	
	// public- > 접근제어자
	// new Studet로 인스턴스 생성 시, heap 메모리에 멤버변수인 studentId, studentName, address가 생성됨.
	// 메서드는 heap이 아닌 다른 곳에서 생성됨...

	private int studentId;
	//private -> 이 클래스 내부에서만 쓰는 변수. 외부에서 참조불가 
	public String studentName;
	public String address;
	
	
	// 생성자 여러개 넣는 것 -> 오버로딩
	// 같은 이름의 메서드, 생성자이지만 매개변수가 다른 경우,, > 오버로딩
	/*	// 디폴트 생성자
		public Student() {}*/
	
	public Student(String name) {
		studentName=name;
	}
	
	// 생성자
	public Student(int id, String name) {
		studentId = id;	// private이지만, 이 클래스에서 초기화 했으므로 초기화 된다!
		studentName = name;
		address = "주소 없음";
	}
		
	
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

	
	/*	public static void main(String[] args) {
			Student studentPark = new Student();
			studentPark.studentName = "박은종";
			studentPark.showStudentInfo();
			
		}*/
}
