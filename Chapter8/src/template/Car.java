package template;

public abstract class Car { // final class는 더이상 상속되지않음! 예를 들어 java의 string 클래스~
	
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	public void washCar() {};  // 하위클래스에서 재정의해서 쓸 수 잇음! 구현의 확장을 할 수 있는 메서드!! 추상메서드가 아니기 때문에 내용이 없어도 error 없음
	// 모든 차들이 반드시 세차를 해야하면 추상메서드로 생성
	
	final public void run() { // final 키워드 쓰면 재정의불가! 시스템관련, 메모리관련, 시나리오를 정의한 메서드에 자주 씀!..
							  // 하위클래스에서 재정의하면 안되는 것에 final 키워드 사용
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		//순서중요.. 틀이되는 시나리오임!
	}
}
