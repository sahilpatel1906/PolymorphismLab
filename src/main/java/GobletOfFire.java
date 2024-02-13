import java.sql.Time;

public class GobletOfFire extends HarryPotterMovie {
    private Time duration;
    private int rating;

    public GobletOfFire(String name) {
        super(name);
    }

    public String printSummary(){
        return "A bunch of games.";
    }


}
