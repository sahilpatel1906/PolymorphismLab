import java.util.ArrayList;

public class Theatre {
    private String theatreName;
    private ArrayList<String> allSummaries;
    private ArrayList<Movie> movies;
    private ArrayList<ISell> itemsForSale;

    public Theatre(String theatreName) {
        this.theatreName = theatreName;
        this.itemsForSale = new ArrayList<>();
        allSummaries = new ArrayList<>();
        movies = new ArrayList<>();
    }

    public int countMovies() {
        return this.movies.size();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public int countSummariesArray(){
        return this.allSummaries.size();
    }
    public void addMovieSummaries(){			// ADDED
        for(Movie movie : this.movies){
            this.allSummaries.add(movie.printSummary());
        }
    }

    public int countItemsForSale() {
        return this.itemsForSale.size();
    }

    public void addItemForSale(ISell item) {
        this.itemsForSale.add(item);
    }

}
