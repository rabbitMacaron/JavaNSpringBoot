package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;

		switch (rank) { // �ڹ� 7���� ���ڿ� ��� ����
			case 1:	
				medalColor = 'G';
				System.out.println("�ݸ޴�");
				break;
			case 2:
				System.out.println("���޴�");
				medalColor = 'S';
				break;
			case 3:
				System.out.println("���޴�");
				medalColor = 'B';
				break;
			default:
				medalColor = 'A';
		}
		
		
		System.out.println(rank + "���� "+medalColor+"�޴� �Դϴ�.");
	}

}
