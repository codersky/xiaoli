package programming.sorting;

import java.util.Arrays;

public class SelectSort {

    public int[] ascSort(int[] candidates){
        for(int i=candidates.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(candidates[j] > candidates[i]){
                    int temp = candidates[j];
                    candidates[j] = candidates[i];
                    candidates[i] = temp;
                }
            }
        }
        return candidates;
    }

    public static void main(String[] args) {
        int [] toSortArray = {2,3,5,7,8,9,0};
        Arrays.stream(new SelectSort().ascSort(toSortArray)).forEach(a -> System.out.print(a));
    }

}
