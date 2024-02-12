import java.util.ArrayList;

public abstract class Movie {
    protected String name;
    protected ArrayList<String> characters;

    public Movie (String name) {
        this.name = name;
        characters = new ArrayList<>();
    }

    public int countCharacters() {
        return this.characters.size();
    }

    public void addCharacter(String name) {
        this.characters.add(name);
    }

}
