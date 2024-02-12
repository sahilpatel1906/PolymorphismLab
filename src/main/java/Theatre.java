import java.util.ArrayList;

public class Theatre {
    private String theatreName;
    private ArrayList<Movie> movies;

    public Theatre(String theatreName) {
        this.theatreName = theatreName;
        movies = new ArrayList<>();
    }

    public int countMovies() {
        return this.movies.size();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

}
