package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		
//		date.day = 100;
//		date.month = 70;	//������ �� ���� ���� ��.. 70���� ����..
//		date.year = 2019;
	
		date.setYear(2019);
		date.setMonth(77);
		date.setDay(100);
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
	}

}
