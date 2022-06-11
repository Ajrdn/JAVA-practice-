package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer1 = new TreeDPrinter<Powder>();
		printer1.setMaterial(new Powder());
		System.out.println(printer1);
		
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		System.out.println(printer2);
		
		printer1.printing();
		printer2.printing();

	}

}
