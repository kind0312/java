package extends1.ex2;

public class ElectricCar extends Car{//클래스는 다중상속을 허용하지 않는다. 인터페이스로 다중 구현을 허용한다.
	
	public void charge() {
		System.out.println("충전합니다.");
	}
}
