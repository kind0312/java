package final1;

public class FinalLocalMain {

	public static void main(String[] args) {
		//final 지역 변수1
		final int data1;
		data1 = 10; //최초 한번만 할당 가능
//		data1 = 20; //컴파일 오류(final은 최초 한번만 가능)
		
		//final 지역 변수2
		final int data2 = 10;
//		data2 = 20; //컴파일 오류(선언하면서 바로 초기화 했으므로)
		
		method(10);
		
	}
	
	static void method(final int parameter) {
//		pararmter = 20; //컴파일 오류(final은 값이 들어오면 끝, 안에서 변경할 수 없다)
	}
}
