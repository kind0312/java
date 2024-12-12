package oop1;

public class ValueDataMain {
	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		add(valueData);
		add(valueData);
		add(valueData);
		System.out.println("최종 숫자 = " + valueData.value);
	}
	
	static void add(ValueData valueData) { //-> static이 붙으면 객체를 생성하지 않고도 메서드를 호출 할 수 있다.
		valueData.value++;
		System.out.println("숫자 증가 value = " + valueData.value);
	}
}
