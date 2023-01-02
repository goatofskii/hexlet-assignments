package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 20, 20, 40, 45));
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 20, 40, 45, 56, 90));
        int count = 5;
        List<Integer> actual = App.take(list, count);
        Assertions.assertEquals(expected, actual);
        // END
    }
}
