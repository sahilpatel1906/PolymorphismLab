import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TheatreTest {
    Theatre theatre;
    Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new GobletOfFire("Harry Potter and Goblet of Fire");
        theatre = new Theatre("theatre");
    }

    @Test
    public void canCountMovies() {
        assertThat(theatre.countMovies()).isEqualTo(0);
    }

    @Test
    public void canAddMovie() {
        theatre.addMovie(movie);
        assertThat(theatre.countMovies()).isEqualTo(1);
    }

    @Test
    public void canCountSummariesArray(){
        assertThat(theatre.countSummariesArray()).isEqualTo(0);
    }

    @Test
    public void canAddSummariessForAllMovies(){
        theatre.addMovie(movie);
        theatre.addMovieSummaries();
        assertThat(theatre.countSummariesArray()).isEqualTo(1);
    }

    @Test
    public void canCountItemsForSale() {
        assertThat(theatre.countItemsForSale()).isEqualTo(0);
    }

    @Test
    public void canAddItemForSale() {
        Popcorn popcorn = new Popcorn("Medium");
        theatre.addItemForSale(movie);
        theatre.addItemForSale(popcorn);
        assertThat(theatre.countItemsForSale()).isEqualTo(2);

    }

}
