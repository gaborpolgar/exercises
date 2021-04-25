package arraysexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GapTest {

    @Test
    public void minGapTest1() {
        Gap g = new Gap();
        assertEquals(1, g.minGap(new int[]{1, 3, 6, 7, 12}));

    }

    @Test
    public void minGapTest2() {
        Gap g = new Gap();

        assertEquals(-7, g.minGap(new int[]{3, 5, 11, 4, 8}));
    }

    @Test
    public void minGapTest3() {
        Gap g = new Gap();
        assertEquals(0, g.minGap(new int[]{}));
    }

    @Test
    public void minGapTest4() {
        Gap g = new Gap();
        assertEquals(0, g.minGap(new int[]{8}));
    }


}