package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		double total = 1;
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(num[i]);
			total *= num[i];
		}
		
		System.out.println("total = " + total);

	}

}
