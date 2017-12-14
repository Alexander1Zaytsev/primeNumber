import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    @Test
    public void testMain() {

        int[] arrControl = {2, 3, 5, 7};
        int limitControl = 10;
        assertArrayEquals(arrControl, Main.calc(limitControl));
    }
}
