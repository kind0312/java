package construct.ex;

public class Book {
	String title;	//제목
	String author;	//저자
	int page;		//페이지 수

	//코드 완성 
	
	Book(){
//		this.title = "";
//		this.author = "";
//		this.page = 0;
		this("", "", 0);
	}
	
	Book(String title, String author){
//		this.title = title;
//		this.author = author;
//		this.page = 0;
		this(title, author, 0);
	}
	
	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	void displayInfo() {
//		System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
		System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 : " + page);
	}
}
