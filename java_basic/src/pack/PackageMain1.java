package pack;

public class PackageMain1 {
	public static void main(String[] args) {
		Data data = new Data(); //자신과 같은 패키지면 클래스 그대로 사용하면 되고
		
		pack.a.User user = new pack.a.User(); //자신과 다른 패키지면 패키지명.클래스로 사용해야된다.
	}
}
