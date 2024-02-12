import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HarryPotterMovieTest {
    HarryPotterMovie harryPotterMovie;

    @BeforeEach
    public void setUp() {
        harryPotterMovie = new HarryPotterMovie("Harry Potter");
    }

    @Test
    public void canPrintSummary() {
        assertThat(harryPotterMovie.printSummary()).isEqualTo("Harry Potter kills voldemort!");
    }
}
