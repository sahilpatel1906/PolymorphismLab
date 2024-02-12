import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TheatreTest {
    Theatre theatre;
    Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("test-movie");
        theatre = new Theatre("theatre");
    }

    @Test
    public void canCountMovies() {
        assertThat(theatre.countMovies()).isEqualTo(0);
    }

}
