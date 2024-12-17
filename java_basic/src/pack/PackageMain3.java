package pack;

import pack.a.User;

public class PackageMain3 {

	public static void main(String[] args) {
		User userA = new User();	//자주 사용하는걸 import를 하자(같은 이름의 클래스가 있다면 import는 둘중 하나만 선택할 수 있다.)
		pack.b.User userB = new pack.b.User(); //물론 둘다 전체 경로를 적어서 사용해도 된다.
	}
}
