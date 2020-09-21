package moviecatalog.models;

public class MovieRatings {
	String name;
	int rating;
	String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	
	public MovieRatings(String name, int rating, String userId) {
		super();
		this.name = name;
		this.rating = rating;
		this.userId = userId;
	}
	public MovieRatings() {
		
	}
}
