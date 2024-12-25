package final1;

public class ConstructInit {

	final int value;
	
	public ConstructInit(int value) {
		this.value = value; //final 인경우 초기값을 할당하지 않은 경우 생성자를 통해서 할당해야된다. 이후에는 값을 바꾸는게 불가능하다.
	}
}
