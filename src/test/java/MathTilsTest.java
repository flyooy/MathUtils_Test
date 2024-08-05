import org.example.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MathUTilsTest {
    @Test
    public void testMax() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.max(3, 5));
        assertEquals(10, mathUtils.max(10, 1));
        assertEquals(-1, mathUtils.max(-1, -5));
        assertEquals(0, mathUtils.max(0, -10));
        assertEquals(7, mathUtils.max(7, 7));
        assertEquals(8, mathUtils.max(4,8));
    }

    @Test
    public void testMin() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(3, mathUtils.min(3, 5));
        assertEquals(1, mathUtils.min(10, 1));
        assertEquals(-5, mathUtils.min(-1, -5));
        assertEquals(-10, mathUtils.min(0, -10));
        assertEquals(7, mathUtils.min(7, 7));
        assertEquals(4, mathUtils.min(4,8));
    }
}
