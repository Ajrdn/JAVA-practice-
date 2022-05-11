package loopexample;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			while(times <= 9) {
				System.out.println(dan + " X " + times + " = " + dan * times);
				times++;
			}
			dan++;
			times = 1;
			System.out.println();
		}
	}

}
