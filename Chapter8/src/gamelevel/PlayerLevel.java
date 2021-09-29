package gamelevel;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	//public abstract void flying(); // 무조건 추가할 행동 있으면 이렇게 추가하면 된다!
	public abstract void showLevelMessage();
	
	
	//player가 go하면 항상 이 순서대로 진행됨. 그래서 final 선언!
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
