package abstractex;

// 모든 메서드가 구현되었다고 해도 abstract 예약어 사용 시 추상클래스가 됨.. > 상속용으로 쓰려고 할 때 쓰기도 함... abstract는 new(인스턴스화) 할 수 없음

public class DeskTop extends Computer { // 추상클래스를 extends하면 구현되지않은 메서드 때문에 error 발생 
	 									//-> 구현되지않은 메서드 생성 or abstract class로 만들어줌. 둘 중 하나만 구현해도 abstract class가 되어야함.

	@Override
	public void display() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop display");
	}

	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}  

	
}
