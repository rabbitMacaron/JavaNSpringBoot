package staticex;

public class Student {

	 
	private static int serialNum = 1000;  //데이터영역.. static영역.. (힙메모리x)
	//static을 밖에서 변형할 수 없도록 private!
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
		address = "주소 없음";
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
		serialNum++;  //일반 메서드에서 static변수 사용가능 -> static변수는 프로그램이 메모리에 load될 때 생성되기 때문에...
					  //static에 큰 메모리 사용하지않기... 프로그램이 로드되는 순간에 많은 메모리 차지 때문에
		return studentId;
	}

	public static int getSerialNum() {
		int i=0; // 함수 안에 선언되어있으니 지역변수... 함수 종료 전까지 사용o
		//studentName = "Lee"; //static안에서 인스턴스 변수 사용불가 ->인스턴스 사용하지않아도 호출될 수 있기 때문에
		
		return serialNum;	//static변수
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	
	
	
}
