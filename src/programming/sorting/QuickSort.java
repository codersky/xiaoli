package programming.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,1};
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(a->System.out.println(a));
    }

    public static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int pivotIndex = partition(a, lo, hi);
            quickSort(a, lo, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, hi);
        }
    }

    /**
     * find pivot location ? and set arr[?] = pivot
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int partition(int[] a, int lo, int hi) {
        int pivotV = a[lo];
        int j = hi + 1;

        for (int i = hi; i > lo; i--) {
            if (a[i] > pivotV) {
                j--;
                swap(a, i, j);
            }
        }
        swap(a, lo, j - 1);
        return j - 1;
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
