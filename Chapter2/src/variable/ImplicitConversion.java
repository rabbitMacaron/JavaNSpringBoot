package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		// ����ȯ
		// - ������ ����ȯ : ���� �� �ʿ�x, ������ -> ū�� �̱� ������
		// - ����� ����ȯ : ĳ�����������, �ڷ��� �ս��� �߻��ϴ� �� �����ߴٴ� ǥ��

		byte bNum = 10; //1byte
		int iNum = bNum; //4byte
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20; //4byte, ����
		float fNum = iNum2; //4byte, �Ǽ��� �� ������ ��
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		
		double dNum;
		dNum = fNum + iNum; // + ������. float+int => float... double+float => double. 2���� ����ȯ�� �߻�
		System.out.println(dNum);
	}

}
