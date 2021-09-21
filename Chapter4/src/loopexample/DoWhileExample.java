package loopexample;

import java.util.Scanner;

public class DoWhileExample {
	
	//do-while
	//은 수행문이 한 번은 돌아야할 경우 사용 > 한 번 수행 후 조건 확인
	//반복문 중 제일 사용 안함
			

	public static void main(String[] args) {

		/*int num=1;
		int sum=0;
		
		do {
			sum += num;
			num++;
		} while(num <=10);
		
		System.out.println(sum);
		System.out.println(num);*/
		
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum=0;
		do {
			input = scanner.nextInt();
			sum+=input;
		} while (input != 0);
	
	
		System.out.println(sum);
	}
}
