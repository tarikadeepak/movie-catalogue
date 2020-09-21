package moviecatalog.models;

import java.util.List;

public class MovieInfo {

	String name;
	String description;
	List<String> starring;
	int rating;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getStarring() {
		return starring;
	}
	public void setStarring(List<String> starring) {
		this.starring = starring;
	}
	
	public MovieInfo(String name, String description, List<String> starring, int rating) {
		super();
		this.name = name;
		this.description = description;
		this.starring = starring;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "MovieInfo [name=" + name + ", description=" + description + ", starring=" + starring + ", rating="
				+ rating + "]";
	}
	public MovieInfo() {
		
	}
}
