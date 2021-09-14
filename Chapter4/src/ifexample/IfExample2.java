package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); // 입력받는 스트림 (기본 내장 함수)
		
		int age= scanner.nextInt();
		
		int charge = 0;
		
		
		if(age < 8) {
			charge = 1000; 
		} else if(age < 14) {
			charge = 1500;
		} else if(age < 20) {
			charge = 2000;
		}else {
			charge = 3000;
		}
		
		System.out.println("나이 : "+ age); // 출력하는 스트림
		System.out.println("요금 : "+ charge);
	}

}
