package abstractex;

// ��� �޼��尡 �����Ǿ��ٰ� �ص� abstract ����� ��� �� �߻�Ŭ������ ��.. > ��ӿ����� ������ �� �� ���⵵ ��... abstract�� new(�ν��Ͻ�ȭ) �� �� ����

public class DeskTop extends Computer { // �߻�Ŭ������ extends�ϸ� ������������ �޼��� ������ error �߻� 
	 									//-> ������������ �޼��� ���� or abstract class�� �������. �� �� �ϳ��� �����ص� abstract class�� �Ǿ����.

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
