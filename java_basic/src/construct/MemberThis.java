package construct;

public class MemberThis {
	String nameField;
	
	void initMember(String nameParameter) {
		nameField = nameParameter;//-> 이렇게 멤버변수와 매개변수의 이름이 다른경우에는 this. 가 생략되어있다고 생각하면 된다.(생략가능)
		//this.nameField = nameParameter;//이렇게 생략 안해도 가능(결과는 위와 똑같음) 
		//-> this를 사용하는 이유는 멤버변수와 매개변수를 구분하기 위해서(멤버변수와 매개변수가 중복인 경우는 this를 사용하자)
	}
}
