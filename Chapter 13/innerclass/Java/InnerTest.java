package innerclass;

class OutClass {
	
	private int num1 = 10;
	private static int num2 = 20;
	private InClass inClass;
	
	
	public OutClass() {
		
		inClass = new InClass();
	}
	
	private class InClass {
		
		int inNum1 = 200;
		
		void inTest() {
			System.out.println(inNum1);
			System.out.println(num1);
			System.out.println(num2);
		}
		
	}
	
	public void usingInTest() {
		
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int inNum1 = 100;
		static int inNum2 = 200;
		
		void inTest() {
			num2 += 10;
			System.out.println(num2);
			System.out.println(inNum1);
			System.out.println(inNum2);
		}
		
		static void sTest() {
			System.out.println(num2);
			System.out.println(inNum2);
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();

	}

}
