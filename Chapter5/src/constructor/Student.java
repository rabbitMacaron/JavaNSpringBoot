package constructor;

public class Student {

	// 어느 순간 강사님 혼자 만듦;; classpart와 동일한 내용임
	private int studentId;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
	}
	
	public Student(int id, String name) {
		studentId = id;	
		studentName = name;
		address = "주소 없음";
	}
		
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
