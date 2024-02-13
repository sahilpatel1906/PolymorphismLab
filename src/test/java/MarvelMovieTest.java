import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MarvelMovieTest {
    MarvelMovie avengersEndGame;

    @BeforeEach
    public void setUp() {
        avengersEndGame = new MarvelMovie("Avengers: End Game");
    }

    @Test
    public void canPrintSummary() {
        assertThat(avengersEndGame.printSummary()).isEqualTo("Avengers saving the world!");
    }
}
