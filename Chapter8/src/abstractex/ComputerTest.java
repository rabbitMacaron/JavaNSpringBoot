package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer computer = new Computer(); <- computer�� �߻�Ŭ�����ϱ� �ν��Ͻ�ȭ�ȵǴϱ� ����... computer.display()�ҷ��� �ҷ��� �޼��尡 ����.. �����ȰԾ����ϰ�
		Computer computer = new DeskTop();
		computer.display();//����Ŭ�������� ����� �� �Ҹ�
		computer.turnOff();//����Ŭ�������� ����� �� �Ҹ�, ����Ŭ�������� �������̵�(������)�ؼ� �ᵵ ��.. ������ ��, ����Ŭ�������� ����� �� �Ҹ�
		
		NoteBook myNote = new MyNoteBook(); // Computer�ε� ����.. �׻� ����Ŭ������ �����ϰ� �ֱ� ������!
		
	}

}
