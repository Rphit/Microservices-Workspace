package comm.example.ratingservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.ratingservice.entity.Rating;

@RestController
@RequestMapping("/")
public class RatingController {

	@Autowired
	private Environment env;
 
	@RequestMapping("/rating")
	public List<Rating> getRatings()
	{
		List<Rating> ratings= Arrays.asList(
				new Rating(1,9),
				new Rating(2,8),
				new Rating(3,7) );
				
			return	ratings;
	
	}

}
