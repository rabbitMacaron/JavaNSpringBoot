package loopexample;

public class ForExample {

	public static void main(String[] args) {
		int count=1;
		int sum=0;
		
		for(int i=0; i<10; i++, count++) { //for ������ ���� ���� ->  for(; i<10;i++)
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
		
		
		
		
		//���ѷ���
		for(;;) {
			
		}
	
		// Java ��� ��� 14.21. Unreachable Statements ��Ģ ��߳��� unreachable code error �߻�
//		while(true) {
//			System.out.println();
//		}
	}

}
