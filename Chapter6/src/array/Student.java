package array;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList;
	

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	// subject 정보 추가
	public void addSubject(String name, int score) {
		// subject와 같은 객체는 생성 후 사용 가능
		Subject subject = new Subject(name, score);
		// subject 추가
		subjectList.add(subject);
	}
	
	// 전체정보 보여주는 메서드
	public void showStudentInfo() {
		int total=0;
		
		for(Subject subject:subjectList) {
			total += subject.getScore();
			System.out.println(studentName+" 학생의 "+subject.getName()+" 과목의 성적은 " +subject.getScore()+" 점입니다.");
		}
		System.out.println(studentName+" 학생의 총 점은 "+total+" 점입니다.");
	}
}
