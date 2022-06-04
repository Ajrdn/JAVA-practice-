package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(101, "이순신");
		Member member2 = new Member(102, "김유신");
		Member member3 = new Member(103, "신사임당");
		Member member4 = new Member(104, "홍길동");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.insertMember(member4, 2);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(member1.getMemberID());
		
		memberArrayList.showAll();

	}

}
