package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer computer = new Computer(); <- computer는 추상클래스니까 인스턴스화안되니까 못씀... computer.display()불러도 불려질 메서드가 없음.. 구현된게없으니가
		Computer computer = new DeskTop();
		computer.display();//하위클래스에서 선언된 게 불림
		computer.turnOff();//상위클래스에서 선언된 게 불림, 하위클래스에서 오버라이딩(재정의)해서 써도 됨.. 재정의 시, 하위클래스에서 선언된 게 불림
		
		NoteBook myNote = new MyNoteBook(); // Computer로도 가능.. 항상 상위클래스를 내포하고 있기 때문에!
		
	}

}
