package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(29, 2, 2000);  // 29���� ok
		MyDate date2 = new MyDate(2, 10, 2006);
		
		
		System.out.println(date1.isVaild());
		System.out.println(date2.isVaild());
		
		
	}

}
