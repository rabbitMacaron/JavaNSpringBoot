package loopexample;

public class ContinueExample {

	
	public static void main(String[] args) {

		// 1~100 �߿� 3�� ����� ��� �غ���
		int num;
		for(num=1; num<=100; num++) {
			
			if( (num%3)!=0 ) continue; // 3�� ����� �ƴ� ���(���� true) contine ����...!
			
			System.out.println(num); // ���� 3�� ����� ���			
		}
	}

}
