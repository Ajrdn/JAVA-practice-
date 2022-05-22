package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(100010, "LEE");
		int price = customer1.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�̰�, " + customer1.showCustomerInfo());
		
		VIPCustomer customer2 = new VIPCustomer(100010, "KIM", 100);
		price = customer2.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�̰�, " + customer2.showCustomerInfo());
		
		Customer customer3 = new VIPCustomer(100010, "Who", 100);
		price = customer3.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "�̰�, " + customer3.showCustomerInfo());
		
	}

}
