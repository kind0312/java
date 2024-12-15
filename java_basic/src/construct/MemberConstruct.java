package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	MemberConstruct(String name, int age, int grade) { //생성자 - 생성자는 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.(규칙)
		System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
