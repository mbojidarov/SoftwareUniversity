package p04_BubbleSortTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void testSortArr(){
        int[] arr = {100, 13, 7, 0, -5, 2};
        Bubble.sort(arr);
        int[] exampleSortedArr = {-5, 0, 2, 7, 13, 100};
        for (int i = 0; i < exampleSortedArr.length; i++) {

            assertEquals(exampleSortedArr[i], arr[i]);
        }
    }
}