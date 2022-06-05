package collection.arraylist;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
