package pack;

//import pack.a.User; //import
//import pack.a.User2; //import
import pack.a.*; // 이렇게 하면 패키지에 모든 클래스를 쓸 수 있다.

public class PackageMain2 {
	public static void main(String[] args) {
		Data data = new Data();
		
		User user = new User();
		
		User2 user2 = new User2();
	}
}
