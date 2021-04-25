package arraysexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountInRangeTest {

    @Test
    public void countInRangeTest() {
        C c = new C();

        assertEquals(1, c.countInRange(new int[]{1, 2, 3, 4, 5, 6}, 2, 4));
    }
    @Test
    public void countInRangeTest2() {
        C c = new C();

        assertEquals(3, c.countInRange(new int[]{17, 1, 22, 14, 36, 7, -43, 5}, 4, 17));
    }
    @Test
    public void countInRangeTest3() {
        C c = new C();
        assertEquals(2, c.countInRange(new int[]{-11,1,5,21}, -11, 21));
    }

}