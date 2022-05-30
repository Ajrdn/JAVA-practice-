package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		
		calc.desription();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		
	}

}
