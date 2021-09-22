package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		
		order.orderNumber = 201907210001L;
		order.customerId = "abc123";
		order.orderDate = "2019년 07월 21일"; //20190721
		order.customerName="홍길동";
		order.productNumber="PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		order.orderInfo();
		
	}

}
