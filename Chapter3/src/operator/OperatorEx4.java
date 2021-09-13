package operator;

public class OperatorEx4 {

	
	// [비트연산자]
	//
	// ~	비트의 반전 (1의보수)	: a = ~a
	// &	비트 단위 AND		: 1&1 > 1 그 외 0
	// |	비트 단위 OR		: 0|0 > 0 그 외 1
	// ^	비트 단위 XOR		: 두 개의 비트가 다른 경우 1
	// <<	왼쪽 shift		: a<<2 변수 a를 2비트만큼 왼쪽으로 
	// >>	오른쪽 shift		: a>>2 변수 a를 2비트만큼 오른쪽으로
	// >>>	오른쪽 shift		: >>와 동일한 연산. 채워지는 비트가 부호와 상관없이 0
	public static void main(String[] args) {
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		
		System.out.println(num2 << 3); // n비트만큼 민 경우.. 값*2^n
		System.out.println(num2 >> 1); // 나누기 2^n...
	}

}
