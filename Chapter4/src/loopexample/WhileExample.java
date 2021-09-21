package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*int num=1;
		int sum=0;
		
		while(num <=100) {
			sum+=num;
			num+=2;
		}
		System.out.println(sum);
		System.out.println(num);*/
		
		
		int input;
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		input= scan.nextInt();
		
		while(input!=0) {
			sum+=input;
			input = scan.nextInt();
		}
		System.out.println(sum);
		
	}

}
