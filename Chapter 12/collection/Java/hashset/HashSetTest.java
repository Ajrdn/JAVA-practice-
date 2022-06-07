package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.add("A"));
		System.out.println(set.add("A"));
		set.add("B");
		set.add("C");
		
		System.out.println(set);

	}

}
