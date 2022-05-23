package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(10010, "�̼���");
		Customer customer2 = new Customer(10011, "�Ż��Ӵ�");
		GoldCustomer customer3 = new GoldCustomer(10012, "ȫ�浿");
		GoldCustomer customer4 = new GoldCustomer(10013, "������");
		VIPCustomer customer5 = new VIPCustomer(10014, "������", 12345);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("===== ������ ��� =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}

	}

}
