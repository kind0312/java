package class1;

public class ClassStart3 {
	
	public static void main(String[] args) {
		Student student1;
		student1 = new Student();
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;
		
		Student student2 = new Student();//객체, 인스턴스(둘의 차이점은 없지만 설명할때 어디소속인지 알릴때는 인스턴스라고 한다
		student2.name = "학생2";			 // ex)student2는 객체야, student2가 Student 클래스의 인스턴스야)
		student2.age = 16;
		student2.grade = 80;
		
		System.out.println("student1 = " + student1);//패키지명.클래스명@참조값
		System.out.println("student2 = " + student2);
		System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
		System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
	}
}
