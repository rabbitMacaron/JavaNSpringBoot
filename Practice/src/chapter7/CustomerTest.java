package chapter7;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> arrayCustomer = new ArrayList<Customer>();

		Customer customer1 = new Customer(10010, "Lee");
		Customer customer2 = new Customer(10020, "Kim");
		Customer customer3 = new GoldCustomer(10030, "Park");
		Customer customer4 = new GoldCustomer(10040, "Ha");
		Customer customer5 = new VIPCustomer(10050, "Choi", 1234);
		
		
		arrayCustomer.add(customer1);
		arrayCustomer.add(customer2);
		arrayCustomer.add(customer3);
		arrayCustomer.add(customer4);
		arrayCustomer.add(customer5);
		
		for(Customer customer : arrayCustomer) {
			System.out.println(customer.showCustomerInfo());
		}
		
		
		System.out.println("**************");
		int price= 10000;
		for(Customer customer : arrayCustomer) {
			int charge= customer.calPrice(price);
			System.out.println(customer.getCustomerName()+" 님이 "+ charge+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+" 님의 보너스 포인트는 "+ customer.bonusPoint+"점입입니다.");
		}
	}

}
