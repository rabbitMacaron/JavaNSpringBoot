package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i =2;
		
		boolean value = ((num1 = num1+10) <10) || ((i=i+2)<10);
		// 전자가 false 이기 때문에 후자는 아예 계산x > 그래서 i=2로 출력된다 
		// '단락회로평가'
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3) ? num2:num3;
	}

}
