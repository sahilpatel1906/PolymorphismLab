import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GobletOfFireTest {
    GobletOfFire gobletOfFire;

    @BeforeEach
    public void setUp() {
        gobletOfFire = new GobletOfFire("Harry Potter and Goblet of Fire");
    }

    @Test
    public void canPrintMovieSpecificSummary() {
        assertThat(gobletOfFire.printSummary()).isEqualTo("A bunch of games.");
    }

}
