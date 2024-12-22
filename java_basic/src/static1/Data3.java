package static1;

public class Data3 {
	public String name;						//인스턴스 변수(static이 붙지 않은 멤버 변수)
	public static int count;	//static	// 클래스 변수(static이 붙은 멤버 변수) -> 클래스변수, 정적변수, static변수라고 부른다.
	
	public Data3(String name) {
		this.name = name;
//		Data3.count++; //-> 이렇게 안해도 된다. 내 클래스 안에 있는 변수이기때문에 아래처럼 Data3을 생략해도 된다.
		count++;
	}
	
}
