public class HarryPotterMovie extends Movie{
    private int movieNumber;
    public HarryPotterMovie(String name, int movieNumber) {
        super(name);
        this.movieNumber = movieNumber;
    }

    public String printSummary() {
        return "Harry Potter kills voldemort!";
    }

    public String printSummary(int movieNumber) {
        return "Harry Potter Movie " + movieNumber;
    }

    public int getMovieNumber() {
        return this.movieNumber;
    }

}
