package classpart;

public class FunctionTest {

	// 왜 static을 붙였냐면... 메인에 static이 있어서! 추후 더 설명
	public static int addNum(int num1, int num2) {
		int result;
		result = num1+num2;
		return result;
	}
	
	// void는 반환x
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum=0;
		int i;
		
		for(i=0; i<=100; i++) {
			sum += i;
		}

		return sum;
	}
	
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int total = addNum(num1, num2);
		
		sayHello("안녕하세요");
//		int test= sayHello("안녕하세요"); //error -> void 이기 때문에
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}

}
