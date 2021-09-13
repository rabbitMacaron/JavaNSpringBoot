package operator;

public class OperatorEx4 {

	
	// [��Ʈ������]
	//
	// ~	��Ʈ�� ���� (1�Ǻ���)	: a = ~a
	// &	��Ʈ ���� AND		: 1&1 > 1 �� �� 0
	// |	��Ʈ ���� OR		: 0|0 > 0 �� �� 1
	// ^	��Ʈ ���� XOR		: �� ���� ��Ʈ�� �ٸ� ��� 1
	// <<	���� shift		: a<<2 ���� a�� 2��Ʈ��ŭ �������� 
	// >>	������ shift		: a>>2 ���� a�� 2��Ʈ��ŭ ����������
	// >>>	������ shift		: >>�� ������ ����. ä������ ��Ʈ�� ��ȣ�� ������� 0
	public static void main(String[] args) {
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		
		System.out.println(num2 << 3); // n��Ʈ��ŭ �� ���.. ��*2^n
		System.out.println(num2 >> 1); // ������ 2^n...
	}

}
