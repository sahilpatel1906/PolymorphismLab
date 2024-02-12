import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MovieTest {
    Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new PhilosophersStone("Harry Potter and Philosophers Stone");
    }

    @Test
    public void canCountCharacters() {
        assertThat(movie.countCharacters()).isEqualTo(0);
    }

    @Test
    public void canAddCharacter() {
        movie.addCharacter("Harry");
        assertThat(movie.countCharacters()).isEqualTo(1);
    }

}
