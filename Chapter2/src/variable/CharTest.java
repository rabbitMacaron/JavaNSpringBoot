package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		//char ch2 = -66; // 음수는 x
		
		char hangul = '\uAC00'; // 유니코드 넣을 때
		System.out.println(hangul);
		
		char ch2 ='한';
		System.out.println(ch2); // 바로 한글 넣어도 된다

	}

}
