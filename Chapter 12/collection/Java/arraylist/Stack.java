package collection.arraylist;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	
	public void push(String data) {
		
		arrayStack.add(data);
	}
	
	public String pop() {
		
		if(arrayStack.size() == 0) {
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
		}
		
		return arrayStack.remove(arrayStack.size() - 1);
	}
	
	public String peek() {
		
		if(arrayStack.size() == 0) {
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
		}
		
		return arrayStack.get(arrayStack.size() - 1);
	}

}
