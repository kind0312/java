package final1;

public class FieldInit {

	static final int CONST_VALUE = 10; //상수 -> 바뀌지 않은 공용변수
	final int value = 10;
	
//	public FieldInit(int value) {
//		this.value = value; //fianl에 초기값이 미리 들어가 있는 경우에는 변경하지 못한다.(final은 값이 한번 셋팅되면 변경 불가능)
//	}
}
