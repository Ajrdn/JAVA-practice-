package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setCustomerID(10100);
		customer1.setCustomerName("Lee");
		
		VIPCustomer customer2 = new VIPCustomer(10101, "Kim", 100);
		customer2.bonusPoint = 1000;
		
		System.out.println(customer1.showCustomerInfo());
		System.out.println(customer2.showCustomerInfo());

	}

}
