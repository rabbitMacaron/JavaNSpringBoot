package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		// 형변환
		// - 묵시적 형변환 : 따로 할 필요x, 작은수 -> 큰수 이기 때문에
		// - 명시적 형변환 : 캐스팅해줘야함, 자료의 손실이 발생하는 걸 인지했다는 표현

		byte bNum = 10; //1byte
		int iNum = bNum; //4byte
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20; //4byte, 정수
		float fNum = iNum2; //4byte, 실수가 더 정밀한 수
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		
		double dNum;
		dNum = fNum + iNum; // + 먼저함. float+int => float... double+float => double. 2번의 형변환이 발생
		System.out.println(dNum);
	}

}
