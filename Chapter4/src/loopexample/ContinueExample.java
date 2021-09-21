package loopexample;

public class ContinueExample {

	
	public static void main(String[] args) {

		// 1~100 중에 3의 배수만 출력 해보기
		int num;
		for(num=1; num<=100; num++) {
			
			if( (num%3)!=0 ) continue; // 3의 배수가 아닐 경우(조건 true) contine 동작...!
			
			System.out.println(num); // 따라서 3의 배수만 출력			
		}
	}

}
