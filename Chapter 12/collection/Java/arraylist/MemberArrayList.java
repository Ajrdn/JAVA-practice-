package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	
	public MemberArrayList() {
		
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Member member;
		Iterator<Member> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			member = iterator.next();
			
			if(memberID == member.getMemberID()) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void insertMember(Member member, int index) {
		
		arrayList.add(index, member);
	}
	
	public void showAll() {
		
		Iterator<Member> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
	}

}
