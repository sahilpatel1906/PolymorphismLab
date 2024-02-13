import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PopcornTest {
    Popcorn popcorn;

    @BeforeEach
    public void setUp() {
        popcorn = new Popcorn("Large");
    }

    @Test
    public void canGetSellPrice() {
        assertThat(popcorn.getSellPrice()).isEqualTo(5);
    }
}
