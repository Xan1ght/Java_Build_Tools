package ok.sorts;

import org.junit.Assert;

public class BubbleSortTest {

    @org.junit.Test
    public void BubbleSortTest1() {
        int[] a = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BubbleSort sortB = new BubbleSort();
        Assert.assertArrayEquals(result, sortB.BubbleSort(a));
    }

    @org.junit.Test
    public void BubbleSortTest2() {
        int[] a = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        BubbleSort sortB = new BubbleSort();
        Assert.assertArrayEquals(result, sortB.BubbleSort(a));
    }

    @org.junit.Test
    public void BubbleSortTest3() {
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        BubbleSort sortB = new BubbleSort();
        Assert.assertArrayEquals(result, sortB.BubbleSort(a));
    }

    @org.junit.Test
    public void BubbleSortTest4() {
        int[] a = new int[] {0, 1, 6, 11, 0, 4, 1, 5};
        int[] result = new int[] {0, 0, 1, 1, 4, 5, 6, 11};
        BubbleSort sortB = new BubbleSort();
        Assert.assertArrayEquals(result, sortB.BubbleSort(a));
    }
}