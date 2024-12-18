package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		
		//다음 패키지 접근 불가
//		DefaultClass1 class1 = new DefaultClass1(); //접근 제어자가 default라서 access.a 패키지만 접근 가능
//		DefaultClass2 class2 = new DefaultClass2(); //접근 제어자가 default라서 access.a 패키지만 접근 가능
	}
}
