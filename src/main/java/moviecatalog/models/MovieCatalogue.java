package moviecatalog.models;

import java.util.List;

public class MovieCatalogue {
	String userId;
	List<MovieInfo> movieInfo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<MovieInfo> getMovieInfo() {
		return movieInfo;
	}
	public void setMovieInfo(List<MovieInfo> movieInfo) {
		this.movieInfo = movieInfo;
	}
	@Override
	public String toString() {
		return "MovieCatalogue [userId=" + userId + ", movieInfo=" + movieInfo + "]";
	}
	public MovieCatalogue(String userId, List<MovieInfo> movieInfoWithRating) {
		System.out.println("Building movicatalogue for " + userId);
		this.userId = userId;
		this.movieInfo = movieInfoWithRating;
	}
	
}
