package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(10010, "이순신");
		Customer customer2 = new Customer(10011, "신사임당");
		GoldCustomer customer3 = new GoldCustomer(10012, "홍길동");
		GoldCustomer customer4 = new GoldCustomer(10013, "이율곡");
		VIPCustomer customer5 = new VIPCustomer(10014, "김유신", 12345);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("===== 고객정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 결과 =====");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}

	}

}
