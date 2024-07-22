package com.asmin.One_TO_MANY_Constructor_Dependency;

public class Review {
	private int reviewid;
	private float rating;
	private String description;
	
	public Review(int reviewid, float rating, String description) {
		
		this.reviewid = reviewid;
		this.rating = rating;
		this.description = description;
	}

	public int getReviewid() {
		return reviewid;
	}

	public float getRating() {
		return rating;
	}

	public String getDescription() {
		return description;
	}

}
