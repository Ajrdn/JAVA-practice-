package lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint1 = str -> System.out.println(str);
		lambdaPrint1.showString("test");
		
		showMyString(lambdaPrint1);
		
		PrintString lambdaPrint2 = returnPrint();
		lambdaPrint2.showString("hello");

	}
	
	public static void showMyString(PrintString lambdaPrint) {
		
		lambdaPrint.showString("test2");
	}
	
	public static PrintString returnPrint() {
		
		return str -> System.out.println(str + " world");
	}

}
