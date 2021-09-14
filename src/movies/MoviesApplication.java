package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] movies;
        movies = MoviesArray.findAll();
        for (Movie movie : movies
             ) {
            System.out.println(movie.name);
        }
    }
}
