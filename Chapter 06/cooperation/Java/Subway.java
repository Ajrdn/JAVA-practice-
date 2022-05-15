package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int charge = 1500;
	int profit;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take() {
		this.profit += charge;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + profit + "원 입니다.");
	}
	
}
