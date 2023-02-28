package ok.sorts;

public class QuickSort {
    public int[] QuickSort(int[] a, int low, int high) {

        int middle = low + (high - low) / 2;
        int opora = a[middle];
        int i = low, j = high;

        while (i <= j) {
            while (a[i] < opora) {
                i++;
            }
            while (a[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            QuickSort(a, low, j);
        }
        if (high > i) {
            QuickSort(a, i, high);
        }

        return a;
    }
}