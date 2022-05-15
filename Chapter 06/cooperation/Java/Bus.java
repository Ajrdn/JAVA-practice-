package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int charge = 1000;
	int profit;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take() {
		this.profit += charge;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + profit + "�� �Դϴ�.");
	}
	
}
