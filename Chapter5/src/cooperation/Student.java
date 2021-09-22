package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	
	
	public Student(String studentName, int money) { //초기화하려고
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 매개변수로 객체를 받음.. 넘어오는 매개변수는 인스턴스여야함
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo () {
		System.out.println(studentName +"님의 잔액은 "+money+" 원 입니다.");
	}
	
	
}
