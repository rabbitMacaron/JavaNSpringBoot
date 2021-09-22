package hiding;

// public   	 
// : ��� ���� ����

// private  	 
// : Ŭ���� ���ο����� ����. �ܺο��� x

// protected	 
// : ���� Ŭ������ private�� ���� Ŭ�������� ����� �� �ְ� �Ϸ���

// �ƹ��͵� �� ���°��(�⺻����������)
// : ���� ��Ű�� �������� ����.. ���� �ٸ� ��Ű������ x


public class MyDate {
	// �������
	private int day;	
	private int month;
	private int year;
	
	private Boolean isValid;
	
	
	// get, set�� �� ���� ����ϴ� �� �ƴ�
	// set X get O -> readOnly
	 
	
	//private ������ ����ϰ� �ʹٸ� public �޼��� ����
	public void setDay(int day) {
		this.day = day; //this ���� �ȵ�... 
		// day = day > �Ű�����day�� ���� �ְڴ�.... ��������� ���� �ȵ�..!
	}
	
	public int getDay() {
		return day;
	}
	
	
	public int getMonth() {
		return month;
	}

	// �޼��忡�� ��ȿ�� ���������� �ƴ��� �ڵ鸵�� �� ����.. -> ������ȣ, ������ ���� ����
	public void setMonth(int month) {
		if(month<1 || month > 12) {
			isValid= false;
		}
		this.month = month; //this.month<-�������, month<-�Ű�����
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public void showDate() {
		if(isValid) { //true�� ���
			System.out.println(year+"�� "+month+"�� "+ day+"�� �Դϴ�.");
		} else {
			System.out.println("��ȿ�������� ��¥�Դϴ�.");
		}
	}
	
}
