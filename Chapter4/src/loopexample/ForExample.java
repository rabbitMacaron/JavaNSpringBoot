package loopexample;

public class ForExample {

	public static void main(String[] args) {
		int count=1;
		int sum=0;
		
		for(int i=0; i<10; i++, count++) { //for 조건은 생략 가능 ->  for(; i<10;i++)
			sum += count;
			//count++;
		}
		System.out.println(sum);
		
		int num=1;
		int total=0;
		while(num<=10) {
			total += num;
			num++;
		}
		
		System.out.println(total);
		
		
		
		
		//무한루프
		for(;;) {
			
		}
	
		// Java 언어 사양 14.21. Unreachable Statements 규칙 어긋나서 unreachable code error 발생
//		while(true) {
//			System.out.println();
//		}
	}

}
