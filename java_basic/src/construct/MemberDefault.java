package construct;

public class MemberDefault {
	String name;
	
	public MemberDefault(){//기본 생성자(안만들어도 기본으로 자바에서 만들어준다. 단 생성자가 하나라도 있으면 기본 생성자를 안만든다)
		System.out.println("생성자 호출");
	}
}
