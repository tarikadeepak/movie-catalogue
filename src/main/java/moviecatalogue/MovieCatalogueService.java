package moviecatalogue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import moviecatalog.models.MovieInfo;
import moviecatalog.models.MovieRatings;
import moviecatalog.models.MovieCatalogue;

@Service
public class MovieCatalogueService {
	@Autowired
	RestTemplate restTemplate;
	MovieCatalogue getMovieCatalogueByUser(String userId){
		ResponseEntity<MovieRatings[]> response
		 = restTemplate.getForEntity("http://localhost:8095/movieratings/" + userId, MovieRatings[].class);
		MovieRatings []movieRatingResponse = response.getBody();
		List<MovieRatings> movieList = Arrays.asList(movieRatingResponse);
		
		movieList.forEach(movie -> System.out.println("Movie " + movie.getName()));
		
		List<MovieInfo> movieInfoList = movieList.stream().map(movie -> 
			restTemplate.getForObject("http://localhost:8090/movies/" + movie.getName(), MovieInfo.class))
			.collect(Collectors.toList());
		List<MovieInfo> movieInfoWithRating = movieInfoList.stream().map(
				movieInfo -> new MovieInfo(
						movieInfo.getName(),
						movieInfo.getDescription(),
						movieInfo.getStarring(),
						movieList.stream().filter(movie -> movie.getName().equals(movieInfo.getName())).findFirst().get().getRating())).collect(Collectors.toList()); 
		movieInfoWithRating.forEach(movie -> System.out.println("movieInfoWithRating " + movie.toString()));
		MovieCatalogue catalogue = 	new MovieCatalogue(userId, movieInfoWithRating);
		System.out.println("catalogue " + catalogue.toString());
		return catalogue;
	
	}
	
	
}
