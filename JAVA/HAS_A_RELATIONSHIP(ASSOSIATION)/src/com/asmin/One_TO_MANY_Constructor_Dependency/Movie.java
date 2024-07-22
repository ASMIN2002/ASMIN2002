package com.asmin.One_TO_MANY_Constructor_Dependency;

public class Movie {
		private String movieId;
		private String moviename;
		
		private Review[] reviews ;

		public Movie(String movieId, String moviename, Review[] review) {
			
			this.movieId = movieId;
			this.moviename = moviename;
			this.reviews = review;
		}
		public void getmovieDetails() {
			System.out.println("Movie details");
			System.out.println("---------------");
			System.out.println("Movie Id     : "+movieId);
			System.out.println("Movie Name   : "+moviename);
			System.out.println();
			System.out.println("REVIEWID\tRATING\tDESCRIPTION");
			System.out.println("----------------------------------");
			for(Review review:reviews) {
				System.out.print(review.getReviewid()+"\t"+"\t");
				System.out.print(review.getRating()+"\t");
				System.out.print(review.getDescription()+"\n");
			}
		}
		
}
