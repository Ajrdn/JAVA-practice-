package collection.treeset;

import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("A");
		tree.add("C");
		tree.add("B");
		
		System.out.println(tree);

	}

}
