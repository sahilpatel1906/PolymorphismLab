import java.sql.Time;

public class PhilosophersStone extends HarryPotterMovie{
    private Time duration;
    private int rating;

    public PhilosophersStone(String name){
        super(name);
    }

    public String printSummary() {
        return "first movie.";
    }
}
