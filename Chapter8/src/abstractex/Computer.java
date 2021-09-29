package abstractex;

public abstract class Computer { // 상위클래스. 여기선 구현x, 하위클래스에 따라 다를거니까.
								 // 하위클래스는 데스크탑 or 노트북 이런식의 내용이 옴. 
								 // 그래서 어떤 것이냐에 따라 display/typing 방법이 다를 수도 있음.. 일체형or모니터 이런식으로도 다르니까

	// 추상클래스는 단독으로 사용x 상위클래스용으로 사용함  
	// abstract는 구현코드가없음. 하위클래스에서 구현될거임 >> 구현의 책임을 하위클래스에게 위임한다, 상속받은 클래스가 구현해야한다
	public abstract void display(); // <- 여기서는 구현하지않겠다..! 이렇게 쓰면 add body를 하던가 abstract를 쓰던가
	public abstract void typing(); // abstract를 추가하면 class에서 오류가 남... 왜?
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
