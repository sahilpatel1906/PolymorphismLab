import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PhilosophersStoneTest {
    PhilosophersStone philosophersStone;

    @BeforeEach
    public void setUp() {
        philosophersStone = new PhilosophersStone("Harry Potter and Philosophers Stone");
    }

    @Test
    public void canPrintMovieSpecificSummary() {
        assertThat(philosophersStone.printSummary()).isEqualTo("first movie.");
    }
}
