package chapter4;

import java.util.Scanner;

public class Question1 {

	// 사칙연산 하기
	public static void main(String[] args) {
		int num1;
		int num2;
		String operator;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사칙연산할 두 수를 입력해주세요.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("원하는 사칙연산 부호를 입력하세요.(+,-,*,/)");
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
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("결과 값은 " + result + "입니다.");
		
		
		
		
		
		
		
		
		// 강사님 git 에 올라와있는 해답
		
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
			System.out.println("연산자 오류입니다");
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");*/
	}
	
	

}
