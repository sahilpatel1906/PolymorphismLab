import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HarryPotterMovieTest {
    HarryPotterMovie harryPotterMovie;

    @BeforeEach
    public void setUp() {
        harryPotterMovie = new PhilosophersStone("Harry Potter and Philosophers Stone");
    }

    @Test
    public void canPrintSequelSummary() {
        assertThat(harryPotterMovie.printSummary()).isEqualTo("first movie.");
    }
}
