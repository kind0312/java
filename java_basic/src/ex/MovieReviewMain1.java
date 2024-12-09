package ex;

public class MovieReviewMain1 {
	public static void main(String[] args) {
		MovieReview[] movieReviews = new MovieReview[2];
		
		MovieReview inception = new MovieReview();
		inception.title = "인셉션";
		inception.review = "인생은 무한 루프";
		movieReviews[0] = inception;
		
		MovieReview aboutTime = new MovieReview();
		aboutTime.title = "어바웃 타임";
		aboutTime.review = "인생 시간 영화";
		movieReviews[1] = aboutTime;
		
		for(MovieReview movie : movieReviews) {
			
			System.out.println("영화 제목 : " + movie.title + ", 리뷰 : " + movie.review);
		}
		
	}
}
