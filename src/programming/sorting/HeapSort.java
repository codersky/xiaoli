package programming.sorting;

import java.util.Arrays;

public class HeapSort {

    private void shiftUp(int [] arr, int k){

        while(2 * k + 1 < arr.length){
            int child = 2 * k + 1;
            if(child +1 < arr.length && arr[child] < arr[child + 1]){
                child = child + 1;
            }
            if(arr[child] <= arr[k] ){
                break;
            }else{
                int tmp = arr[child];
                arr[child] = arr[k];
                arr[k] = tmp;
                k = child;
            }
        }

    }

    private void heapify(int[] arr){
        for(int k = (arr.length - 1); k>=0; k--){
            shiftUp(arr, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,6,2,2,3,5};
        new HeapSort().heapify(arr);
        Arrays.stream(arr).forEach(a -> System.out.print(a));
    }

}