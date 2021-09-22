package chapter5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Order {
	
	long orderNumber;		//주문번호
	String customerId;		//주문자아이디
	String orderDate;			//주문날짜
	String customerName;	//주문자 이름
	String productNumber;	//주문 상품 번호
	String orderAddress;	//배송 주소
	
	
	
	public void orderInfo() {
		
		System.out.println("주문번호: "+orderNumber);
		System.out.println("주문자 아이디: "+customerId);
		System.out.println("주문 날짜: "+ orderDate);
		System.out.println("주문자 이름: "+customerName);
		System.out.println("주문 상품 번호: "+productNumber);
		System.out.println("배송 주소: "+orderAddress);
	}
}
