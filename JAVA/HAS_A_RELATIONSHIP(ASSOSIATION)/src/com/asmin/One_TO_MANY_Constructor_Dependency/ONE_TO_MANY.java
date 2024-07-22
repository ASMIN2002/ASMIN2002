package com.asmin.One_TO_MANY_Constructor_Dependency;

public class ONE_TO_MANY {

	public static void main(String[] args) {
		Review review1 = new Review(111, 3.4f, "GOOD");
		Review review2 = new Review(222, 2.0f, "BELOW");
		Review review3 = new Review(333, 4.5f, "BLOCKBUSTER");
		Review[] reviews = {review1,review2,review3};
		
		Movie movie = new Movie("M-111", "HEROPANTI", reviews);
		movie.getmovieDetails();
		
	}

}
