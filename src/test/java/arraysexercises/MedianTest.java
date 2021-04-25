package arraysexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    @Test
    public void medianEvenTest() {

        MedianFinder mf = new MedianFinder();

        assertEquals(30, mf.median(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    public void medianEvenTest1() {

        MedianFinder mf = new MedianFinder();
        assertEquals(5, mf.median(new int[]{5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17}));
    }

    @Test
    public void medianEvenTest2() {

        MedianFinder mf = new MedianFinder();
        assertEquals(25, mf.median(new int[]{42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27}));
    }

    @Test
    public void medianEOddTest() {

        MedianFinder mf = new MedianFinder();

        assertEquals(2.5, mf.median(new int[]{1, 4, 2, 4, 2, 3, 5, 3, 1, 1}));
    }

    @Test
    public void medianEOddTest2() {

        MedianFinder mf = new MedianFinder();

        assertEquals(25, mf.median(new int[]{10, 20, 30, 40}));

    }

}