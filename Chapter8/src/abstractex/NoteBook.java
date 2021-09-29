package abstractex;

public abstract class NoteBook extends Computer{ // 추상클래스를 extends하면 구현되지않은 메서드 때문에 error 발생 
												 //-> 구현되지않은 메서드 생성 or abstract class로 만들어줌. 둘 중 하나만 구현해도 abstract class가 되어야함.



	@Override
	public void typing() {
		System.out.println("NoteBook typing");
	}
	
}
