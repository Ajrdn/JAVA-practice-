package loopexample;

public class Lozenge {

	public static void main(String[] args) {
		
		int min = 4, max = 4;
		
		for(int l = 1; l <= 4; l++) {
			for(int i = 1; i <= min - 1; i++) {
				System.out.print(" ");
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print("*");
			}
			
			for(int i = max + 1; i <= 7; i++ ) {
				System.out.print(" ");
			}
			min--;
			max++;
			System.out.println();
		}
		
		min = 2;
		max = 6;
		
		for(int l = 5; l <= 7; l++) {
			for(int i = 1; i <= min - 1; i++) {
				System.out.print(" ");
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print("*");
			}
			
			for(int i = max + 1; i <= 7; i++ ) {
				System.out.print(" ");
			}
			min++;
			max--;
			System.out.println();
		}
	}

}
