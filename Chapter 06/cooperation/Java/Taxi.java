package cooperation;

public class Taxi {
	
	int taxiNumber;
	int charge = 10000;
	int profit;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take() {
		profit += charge;
	}
	
	public void showInfo() {
		System.out.println("�ý� " + taxiNumber + "���� ������ " + profit + "�� �Դϴ�.");
	}
	
}
