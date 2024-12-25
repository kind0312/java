package final1;

public class FinalRefMain {

	public static void main(String[] args) {
		final Data data = new Data(); //참조형
//		data = new Data(); //final이라서 이미 할당했다.(참조 대상 변경 불가)
		
		//참조 대상의 값은 변경 가능
		data.value = 10;
		System.out.println(data.value);
		data.value = 20;
		System.out.println(data.value);
	}
}
