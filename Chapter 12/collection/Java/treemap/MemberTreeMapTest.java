package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member member1 = new Member(101, "�̼���");
		Member member2 = new Member(102, "������");
		Member member3 = new Member(103, "�Ż��Ӵ�");
		
		memberTreeMap.addMember(member1);
		memberTreeMap.addMember(member2);
		memberTreeMap.addMember(member3);
		
		memberTreeMap.showAllMember();

	}

}
