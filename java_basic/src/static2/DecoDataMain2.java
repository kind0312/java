package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*;//모든 static 메서드를 사용하겠다.

public class DecoDataMain2 {

	public static void main(String[] args) {
		System.out.println("1. 정적 호출");
		staticCall();
		
		System.out.println("2. 인스턴스 호출1");
		DecoData data1 = new DecoData();
		data1.instanceCall();
		
		System.out.println("3. 인스턴스 호출2");
		DecoData data2 = new DecoData();
		data2.instanceCall();
		
		staticCall1(data1);
		
		//추가
		//인스턴스를 통한 접근 //->이렇게도 가능하지만 이렇게 사용하면 클래스(static) 소속인지, 인스턴스 소속인지 명확하지 않아서 권장하지 않는다.
		DecoData data3 = new DecoData();
		data3.staticCall();
		
		//클래스를 통한 접근 //->static이라서 클래스를 통해 바로 접근하는걸 알 수 있다.
		staticCall();
	}
}
