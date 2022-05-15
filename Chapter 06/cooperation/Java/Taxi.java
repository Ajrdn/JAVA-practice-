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
		System.out.println("택시 " + taxiNumber + "번의 수입은 " + profit + "원 입니다.");
	}
	
}
