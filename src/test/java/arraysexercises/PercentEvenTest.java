package arraysexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvensTest {

    @Test
    public void percentEvenTest1() {
        Evens e = new Evens();

        assertEquals(40.0, e.percentEven(new int[]{6, 2, 9, 11, 3}));


    }

    @Test
    public void percentEvenTest2() {
        Evens e = new Evens();

        assertEquals(0.0, e.percentEven(new int[]{}));

    }

    @Test
    public void percentEvenTest3() {
        Evens e = new Evens();

        assertEquals(0.0, e.percentEven(new int[]{9, 11, 3}));

    }
}
