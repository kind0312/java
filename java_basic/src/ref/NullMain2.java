package ref;

public class NullMain2 {
	public static void main(String[] args) {
		Data data = null;
		data.value = 10; //NullPointerException 예외 발생 --> 참조값이 Null인데 .을찍어서 찾아가려고 하니까 발생
		System.out.println("data = " + data.value);
	}
}
