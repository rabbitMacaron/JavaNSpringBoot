package abstractex;

public abstract class Computer { // ����Ŭ����. ���⼱ ����x, ����Ŭ������ ���� �ٸ��Ŵϱ�.
								 // ����Ŭ������ ����ũž or ��Ʈ�� �̷����� ������ ��. 
								 // �׷��� � ���̳Ŀ� ���� display/typing ����� �ٸ� ���� ����.. ��ü��or����� �̷������ε� �ٸ��ϱ�

	// �߻�Ŭ������ �ܵ����� ���x ����Ŭ���������� �����  
	// abstract�� �����ڵ尡����. ����Ŭ�������� �����ɰ��� >> ������ å���� ����Ŭ�������� �����Ѵ�, ��ӹ��� Ŭ������ �����ؾ��Ѵ�
	public abstract void display(); // <- ���⼭�� ���������ʰڴ�..! �̷��� ���� add body�� �ϴ��� abstract�� ������
	public abstract void typing(); // abstract�� �߰��ϸ� class���� ������ ��... ��?
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
