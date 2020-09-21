package moviecatalogue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moviecatalog.models.MovieCatalogue;

@RestController
public class MovieCatalogueController {
	@Autowired
	MovieCatalogueService service;
	
	@RequestMapping("/moviecatalogue/{userid}")
	MovieCatalogue getMovieCatalogueByUser(@PathVariable("userid") String userId) {
		System.out.println("cataloguemmmmmmmmmmmmmm");
		MovieCatalogue catalogue = service.getMovieCatalogueByUser(userId);
		System.out.println("catalogue in controller " + catalogue.toString());
		return catalogue;
	}

}
