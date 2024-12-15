package construct;

public class ConstructMain1 {
	public static void main(String[] args) {
		//생성자 등장 전
//		MemberInit member1 = new MemberInit();
//		member1.initMember("user1", 15, 90);
		
		//생성자 등장 후
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
		
		MemberConstruct[] members = {member1, member1};
		
		for(MemberConstruct member : members) {
			System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
		}
	}
}
