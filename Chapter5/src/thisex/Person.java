package thisex;

public class Person {
	String name;
	int age;
	
	// ������ ����: �ν��Ͻ����� �ʱ�ȭ 
	public Person() {
		this("�̸�����", 1); // this�� ����Ϸ��� ó�� statement������
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void showInfo() {
		System.out.println(name+", "+age);
	}
	
	// ��ȯŸ���� Ŭ���� �ڱ��ڽ�
	public Person getSelf() {
		return this; //return �ּҰ�
	}
}
