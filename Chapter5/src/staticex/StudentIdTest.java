package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		
		//Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum()); //1001, static은 클래스이름.~~으로 쓰는 게 맞음
		//static 변수는 인스턴스와 상관x
		//SerialNum++ <- 밖에서 ++ 할 수 없도록 public으로 만들면 안되고 private 사용 권장..
		
		
		/*Student studentKim = new Student("Kim");
		System.out.println(Student.serialNum); //1002	 
		System.out.println(Student.serialNum); //1002  	-> Kim.serial 출력 값 동일.. 같은 메모리 보는 중..
		
		
		
		System.out.println(studentLee.getStudentName()+"의 학번: "+studentLee.getStudentId());
		System.out.println(studentKim.getStudentName()+"의 학번: "+studentKim.getStudentId());
		
		*/
	
	
	}
}
