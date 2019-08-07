package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfArraysTest {

    @Test
    public void lowestOfArrays() {
    ArrayOfArrays testArrofArr = new ArrayOfArrays();
        int[][] testArr = {
                {2, 5, 6, 70, 7, 65, 8},
                {1, 2, 3, 4, 5, 6, 7},
                {4, 54, 60, 1, 59, 57, 61},
                {65, 56, 6, 52, 7, 62, 9}
        };

        assertArrayEquals("it's suppose to return the lowest average",new int[]{1,2,3,4,5,6,7},testArrofArr.lowestOfArrays(testArr));
    }
}