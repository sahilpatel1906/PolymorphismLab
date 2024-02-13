import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HarryPotterMovieTest {
    HarryPotterMovie philosophersStone;

    @BeforeEach
    public void setUp() {
        philosophersStone = new HarryPotterMovie("Harry Potter and Philosophers Stone",1);
    }

    @Test
    public void canPrintSummary() {
        assertThat(philosophersStone.printSummary()).isEqualTo("Harry Potter kills voldemort!");
    }

    @Test
    public void canPrintOverloadedMovieSummary() {
        int movieNumber = philosophersStone.getMovieNumber();
        assertThat(philosophersStone.printSummary(movieNumber)).isEqualTo("Harry Potter Movie 1");
    }
}
