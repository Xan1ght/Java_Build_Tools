package ok.sorts;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[] {3, 4, 6, 1, 4, 9, 10, 11, 50, 0};

        /* 1 Сортировка - Пузырьковая */
        BubbleSort sortB = new BubbleSort();
        int[] resultB = sortB.BubbleSort(a);

        System.out.println("Пузырьковая сортировка:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(resultB[i]);
        }
        System.out.println();

        /* 2 Сортировка - Быстрая */
        QuickSort sortQ = new QuickSort();
        int[] resultQ = sortQ.QuickSort(a,0, a.length-1);

        System.out.println("Быстрая сортировка:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(resultQ[i]);
        }
    }
}