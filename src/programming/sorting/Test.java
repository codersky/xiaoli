package programming.sorting;


import java.util.Arrays;

public class Test {

    /**
     * {2,3,5,6,2,4,7,8} 5
     *
     * @param arr
     * @param num
     */
    public static void leftMRight(int[] arr, int num){

        int l = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] >= num){

            }else{
                swap(arr, i, l++);
            }
        }
        Arrays.stream(arr).forEach(a -> System.out.println(a));
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,6,2,4,7,8};
        leftMRight(arr, 5);

    }

}
