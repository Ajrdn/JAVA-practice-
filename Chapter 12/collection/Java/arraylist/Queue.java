package collection.arraylist;

import java.util.ArrayList;

public class Queue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	
	public void enQueue(String data) {
		
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		
		if(arrayQueue.size() == 0) {
			System.out.println("ť�� ����ֽ��ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(0);
	}

}
