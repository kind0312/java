package oop1;

public class ValueObjectMain {
	public static void main(String[] args) {
		ValueData2 valueData = new ValueData2();
		valueData.add();
		valueData.add();
		valueData.add();
		System.out.println("최종 숫자 = " + valueData.value);
	}
}
