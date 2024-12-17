package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		//필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
//		speaker.volume = 200; //private이 붙은경우 해당 클래스 안에서만 접근 가능하다.(밖에서는 접근 불가능)
		speaker.showVolume();
	}
}
