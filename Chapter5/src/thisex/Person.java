package thisex;

public class Person {
	String name;
	int age;
	
	// 생성자 역할: 인스턴스생성 초기화 
	public Person() {
		this("이름없음", 1); // this를 사용하려면 처음 statement여야함
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void showInfo() {
		System.out.println(name+", "+age);
	}
	
	// 반환타입은 클래스 자기자신
	public Person getSelf() {
		return this; //return 주소값
	}
}
