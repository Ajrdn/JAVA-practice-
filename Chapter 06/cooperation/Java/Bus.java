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
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + profit + "원 입니다.");
	}
	
}
