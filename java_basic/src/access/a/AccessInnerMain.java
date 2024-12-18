package access.a;

public class AccessInnerMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();
		//public 호출 가능
		 data.publicField = 1;
		 data.publicMethod();
		 
		 //같은 패키지 default 호출 가능
		 data.defaultField = 2;
		 data.defaultMethod();
		 
		 //private 호출 불가
//		 data.privateField = 3; //-> private라 호출 불가능
//		 data.privateMethod(); 	//-> private라 호출 불가능
		 
		 data.innerAccess(); //메서드 자체는 public이라 호출 가능
	}
}
