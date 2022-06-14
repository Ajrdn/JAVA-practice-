package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String str1, String str2) {
		
		if(str1.getBytes().length <= str2.getBytes().length)
			return str1;
		else
			return str2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"¾È³çÇÏ¼¼¿ä!", "hello", "Good morning", "¹Ý°©½À´Ï´Ù!"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (str1, str2) -> {
			if(str1.getBytes().length >= str2.getBytes().length)
				return str1;
			else
				return str2;
		}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);

	}

}
