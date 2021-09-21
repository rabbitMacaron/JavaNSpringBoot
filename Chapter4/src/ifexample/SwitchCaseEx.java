package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;

		switch (rank) { // 자바 7부터 문자열 사용 가능
			case 1:	
				medalColor = 'G';
				System.out.println("금메달");
				break;
			case 2:
				System.out.println("은메달");
				medalColor = 'S';
				break;
			case 3:
				System.out.println("동메달");
				medalColor = 'B';
				break;
			default:
				medalColor = 'A';
		}
		
		
		System.out.println(rank + "등은 "+medalColor+"메달 입니다.");
	}

}
