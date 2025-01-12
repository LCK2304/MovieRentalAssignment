package za.ac.cput.entity;

/*
    Rating.java
    Entity for Rating
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

public class Rating {

    private int movieId;
    private double rating;

    private Rating(RatingBuilder RatingBuilder){
        this.movieId = RatingBuilder.movieId;
        this.rating = RatingBuilder.rating;
    }

    public static class RatingBuilder {
        private int movieId;
        private double rating;

        public RatingBuilder setMovieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public RatingBuilder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        public Rating build(){
            return new Rating(this);
        }
    }

    @Override
    public String toString() {
        return "Rating{" +
                "movieId=" + movieId +
                ", rating=" + rating +
                '}';
    }
}
