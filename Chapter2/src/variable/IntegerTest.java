package variable;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bs = 127; // -129 or 128은 범위를 벗어나서 오류 발생
		System.out.println(bs);
		
		//int iVal = 12345678900; // integer는 4byte... 범위벗어남
		//long lVal = 12345678900; // 12345678900은 4byte보다 큼,, 4byte보다 큰 경우 이렇게 쓰면 오류
		long lVal = 12345678900L; // 소문자 써도 되지만 구분하기 쉽게 되도록 대문자 쓰기
	}

}
