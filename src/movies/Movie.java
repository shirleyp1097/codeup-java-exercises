package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return this.name;
    }

    public void setMovieName(String newName) {
        this.name = newName;
    }

    public String getMovieCategory() {
        return this.category;
    }

    public void setMovieCategory() {
        this.category = category;
    }

}
