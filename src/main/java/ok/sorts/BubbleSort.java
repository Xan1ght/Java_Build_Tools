package ok.sorts;

public class BubbleSort {
    public int[] BubbleSort(int[] a){

        int b;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        return a;
    }
}