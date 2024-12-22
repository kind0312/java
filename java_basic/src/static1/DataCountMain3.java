package static1;

public class DataCountMain3 {

	public static void main(String[] args) {
		Data3 data1 = new Data3("A");
		System.out.println("A count = " + Data3.count);
		
		Data3 data2 = new Data3("B");
		System.out.println("B count = " + Data3.count);
		
		Data3 data3 = new Data3("C");
		System.out.println("C count = " + Data3.count);
		
		//추가
		//인스턴스를 통한 접근 --> 권장하지 않음(코드를 읽을때 이게 인스턴스 변수인가로 착각할 수 있기 때문에)
		Data3 data4 = new Data3("D");
		System.out.println("D count = " + data4.count); //-> 이 경우 인스턴스(힙 영역)에서 사용하는게 아니고 static이므로 메서드 영역에서 사용
		
		//클래스를 통한 접근
		System.out.println("D count = " + Data3.count);
	}
}
