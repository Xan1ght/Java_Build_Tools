package ok.sorts;

import org.junit.Assert;

public class QuickSortTest {

    @org.junit.Test
    public void QuickSortTest1() {
        int[] a = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        QuickSort sortQ = new QuickSort();
        Assert.assertArrayEquals(result, sortQ.QuickSort(a,0, a.length-1));
    }

    @org.junit.Test
    public void QuickSortTest2() {
        int[] a = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        QuickSort sortQ = new QuickSort();
        Assert.assertArrayEquals(result, sortQ.QuickSort(a,0, a.length-1));
    }

    @org.junit.Test
    public void QuickSortTest3() {
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        QuickSort sortQ = new QuickSort();
        Assert.assertArrayEquals(result, sortQ.QuickSort(a,0, a.length-1));
    }

    @org.junit.Test
    public void QuickSortTest4() {
        int[] a = new int[] {0, 1, 6, 11, 0, 4, 1, 5};
        int[] result = new int[] {0, 0, 1, 1, 4, 5, 6, 11};
        QuickSort sortQ = new QuickSort();
        Assert.assertArrayEquals(result, sortQ.QuickSort(a,0, a.length-1));
    }
}