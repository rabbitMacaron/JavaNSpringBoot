package template;

public abstract class Car { // final class�� ���̻� ��ӵ�������! ���� ��� java�� string Ŭ����~
	
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	public void washCar() {};  // ����Ŭ�������� �������ؼ� �� �� ����! ������ Ȯ���� �� �� �ִ� �޼���!! �߻�޼��尡 �ƴϱ� ������ ������ ��� error ����
	// ��� ������ �ݵ�� ������ �ؾ��ϸ� �߻�޼���� ����
	
	final public void run() { // final Ű���� ���� �����ǺҰ�! �ý��۰���, �޸𸮰���, �ó������� ������ �޼��忡 ���� ��!..
							  // ����Ŭ�������� �������ϸ� �ȵǴ� �Ϳ� final Ű���� ���
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		//�����߿�.. Ʋ�̵Ǵ� �ó�������!
	}
}
