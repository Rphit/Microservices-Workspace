package comm.example.ratingservice.entity;

public class Rating {

	int id;
	int rating;
	
	public Rating(int id, int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
