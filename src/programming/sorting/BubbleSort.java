package programming.sorting;

import java.util.Arrays;

public class BubbleSort {

    public int[] ascSort(int[] candidates) {

        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < candidates.length - 1; j++) {
                    if (candidates[j] > candidates[j + 1]) {
                        int temp = candidates[j + 1];
                        candidates[j + 1] = candidates[j];
                        candidates[j] = temp;
                    }
            }
        }

        return candidates;
    }

    public int[] ascSortQuickFinish(int[] candidates) {

        for (int i = 0; i < candidates.length; i++) {
            boolean fledged = true;
            for (int j = 0; j < candidates.length - 1; j++) {
                if (candidates[j] > candidates[j + 1]) {
                    int temp = candidates[j + 1];
                    candidates[j + 1] = candidates[j];
                    candidates[j] = temp;
                    fledged = false;
                }
            }
            if(fledged){
                System.out.println("Array sorted finished, exit. i=" + i);
                break;
            }

        }

        return candidates;
    }


    public static void main(String[] args) {
        int [] toSortArray = {2,3,5,7,8,9,0};
        int [] sortedArray = {3,2,1,4,5};
        Arrays.stream(new BubbleSort().ascSort(toSortArray)).forEach(a -> System.out.print(a));
        Arrays.stream(new BubbleSort().ascSortQuickFinish(sortedArray)).forEach(a -> System.out.print(a));

    }

}
