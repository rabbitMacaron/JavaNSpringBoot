package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		
		order.orderNumber = 201907210001L;
		order.customerId = "abc123";
		order.orderDate = "2019�� 07�� 21��"; //20190721
		order.customerName="ȫ�浿";
		order.productNumber="PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		order.orderInfo();
		
	}

}
