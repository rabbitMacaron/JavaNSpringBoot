package chapter4;

import java.util.Scanner;

public class Question1 {

	// ��Ģ���� �ϱ�
	public static void main(String[] args) {
		int num1;
		int num2;
		String operator;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��Ģ������ �� ���� �Է����ּ���.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("���ϴ� ��Ģ���� ��ȣ�� �Է��ϼ���.(+,-,*,/)");
		operator = scan.next();
		
		int result=0;
		
		if(operator.equals("+")) {
			result = num1+num2;
		} else if(operator.equals("-")) {
			result = num1-num2;
		} else if(operator.equals("*")) {
			result = num1*num2;
		} else if(operator.equals("/")) { 
			result = num1/num2;
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		System.out.println("��� ���� " + result + "�Դϴ�.");
		
		
		
		
		
		
		
		
		// ����� git �� �ö���ִ� �ش�
		
		/*	char operator = '+';
		int num1 = 10;
		int num2 = 5;
	
		int result = 0;
	
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("������ �����Դϴ�");
			return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");*/
	}
	
	

}
