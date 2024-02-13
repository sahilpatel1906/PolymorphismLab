import java.util.ArrayList;

public abstract class Movie implements ISell{
    protected String name;
    protected ArrayList<String> characters;
    private double sellPrice;


    public Movie (String name) {
        this.name = name;
        characters = new ArrayList<>();
        this.sellPrice = 10;
    }

    public int countCharacters() {
        return this.characters.size();
    }

    public void addCharacter(String name) {
        this.characters.add(name);
    }

    public abstract String printSummary();

    public double getSellPrice() {
        return this.sellPrice;
    }
}
