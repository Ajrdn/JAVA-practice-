package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take();
		money -= bus.charge;
	}
	
	public void takeSubway(Subway subway) {
		subway.take();
		money -= subway.charge;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take();
		money -= taxi.charge;
	}
	
	public void showInfo() {
		System.out.println(studentName + "?? ?? ?? " + money + "? ???.");
	}
	
}
