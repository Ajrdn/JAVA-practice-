package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tomas");
		list.add("James");
		list.add("Edward");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(str -> System.out.println(str));
		
		list.stream().sorted().forEach(str -> System.out.println(str));

	}

}
