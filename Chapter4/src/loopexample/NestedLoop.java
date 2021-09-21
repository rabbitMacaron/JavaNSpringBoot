package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		// 2(단) x 3(카운트)
		int dan=2;
		int count=1;
		
		
		/*	for(dan = 2; dan<=9; dan++) {
				for(count=1; count <=9; count++) {
					System.out.println(dan+" x "+ count+"= "+dan*count);
				}
				System.out.println();
			}*/
		
		while(dan <= 9) {
			while(count <= 9) {
				System.out.println(dan+" x "+ count+"= "+dan*count);
				count++;
			}
			dan++;
			System.out.println();
			count=1;
		}
		
	}

}
