package chapter4;

import java.util.Scanner;

public class Question2 {

	// ���̾Ƹ�� ���
	public static void main(String[] args) {
			System.out.print("Ȧ���� �Է��ϼ���: ");
			
			Scanner scanner = new Scanner(System.in);
			int num;
			num = scanner.nextInt();
			
			int size = (num/2+1);

			
			//���
			for(int i=0; i<size; i++) {	// 0
				for (int j=1; j<size-i; j++) { 
			        System.out.print(" ");
			    }
			    for (int j=0; j<i*2+1; j++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}
			
		
			//�ϴ�
			for (int i=size-1; i>0; i--) {
			    for (int j=size-i; j>0; j--) {
			        System.out.print(" ");
			    }
			    for (int j=i*2-1; j>0; j--) {
			        System.out.print("*");
			    }
			    System.out.println();
			
			}
		
		
		
		// ����� git �� �ö���ִ� �ش�
		
		/*	System.out.println("Ȧ�� ���� �Է��ϼ���:");
		
			Scanner scanner = new Scanner(System.in);
			int lineCount = scanner.nextInt();  //�ٸ� Ȧ�� ���� �־����
			int spaceCount = lineCount/2 +1;
			int starCount = 1;
		
			for(int i = 0; i<lineCount; i++) {
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				for(int j=0; j<starCount; j++) {
					System.out.print('*');
				}
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
		
				if(i < lineCount/2) {
					spaceCount-=1;
					starCount+=2;
				}
				else {
					spaceCount+=1;
					starCount-=2;
				}
				System.out.println();
			}*/
		
	}
}
