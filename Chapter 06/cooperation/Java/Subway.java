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
		System.out.println("����ö " + lineNumber + "ȣ���� �°��� " + passengerCount + "���̰�, ������ " + profit + "�� �Դϴ�.");
	}
	
}
