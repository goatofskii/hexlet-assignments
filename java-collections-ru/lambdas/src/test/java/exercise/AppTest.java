package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    @Test
    public void testEnlargeArrayImage() {
        String[][] image = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };

        String[][] expected = {
                {"a", "a", "b", "b", "c", "c"},
                {"a", "a", "b", "b", "c", "c"},
                {"d", "d", "e", "e", "f", "f"},
                {"d", "d", "e", "e", "f", "f"},
                {"g", "g", "h", "h", "i", "i"},
                {"g", "g", "h", "h", "i", "i"}
        };

        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }
}
// END
