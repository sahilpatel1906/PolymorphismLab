import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MovieTest {
    Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("movie");
    }

    @Test
    public void canCountCharacters() {
        assertThat(movie.countCharacters()).isEqualTo(0);
    }

}
