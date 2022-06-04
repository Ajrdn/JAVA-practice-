package collection.linkedlist;

import java.util.LinkedList;
import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Member> MemberLinkedList = new LinkedList<Member>();
		
		Member member1 = new Member(101, "이순신");
		Member member2 = new Member(102, "김유신");
		Member member3 = new Member(103, "신사임당");
		Member member4 = new Member(104, "홍길동");
		
		MemberLinkedList.add(member1);
		MemberLinkedList.add(member2);
		
		System.out.println(MemberLinkedList);
		
		MemberLinkedList.add(1, member3);
		
		System.out.println(MemberLinkedList);
		
		MemberLinkedList.addFirst(member4);
		
		System.out.println(MemberLinkedList);
		
		for(Member member : MemberLinkedList) {
			System.out.println(member);
		}

	}

}
