package chapter5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Order {
	
	long orderNumber;		//�ֹ���ȣ
	String customerId;		//�ֹ��ھ��̵�
	String orderDate;			//�ֹ���¥
	String customerName;	//�ֹ��� �̸�
	String productNumber;	//�ֹ� ��ǰ ��ȣ
	String orderAddress;	//��� �ּ�
	
	
	
	public void orderInfo() {
		
		System.out.println("�ֹ���ȣ: "+orderNumber);
		System.out.println("�ֹ��� ���̵�: "+customerId);
		System.out.println("�ֹ� ��¥: "+ orderDate);
		System.out.println("�ֹ��� �̸�: "+customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: "+productNumber);
		System.out.println("��� �ּ�: "+orderAddress);
	}
}
