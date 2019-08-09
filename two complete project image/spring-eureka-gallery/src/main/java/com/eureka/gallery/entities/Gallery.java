package com.eureka.gallery.entities;

import java.util.List;

public class Gallery {
	private int id;
	private List<Object> images;
	private List<Object> ratings;
	
	public Gallery() {
	}

	public Gallery(int galleryId) {
		this.id = galleryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

	public List<Object> getRatings() {
		return ratings;
	}

	public void setRatings(List<Object> ratings) {
		this.ratings = ratings;
	}
	
	
}
