package construct;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	//추가
	void initMember(String name, int age, int grade) {
		this.name = name;	//멤버변수(필드)와 메서드의 매개변수 이름이 같으면 메서드 안에서는 매개변수를 접근하게 되는데(가까운것)
		this.age = age;		//멤버변수에 접근하려면  this.를 붙여줘야 한다.
		this.grade = grade;
	}
}
