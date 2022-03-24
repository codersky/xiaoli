package programming.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,1};
        new MergeSort().sortAsc(arr);
        Arrays.stream(arr).forEach(a->System.out.println(a));
    }

    public void sortAsc(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        process(arr, 0, arr.length-1);

    }

    private void process(int[] arr, int l, int r){
        if(l==r){
            return;
        }

        int mid = l + ((r-l) >> 1);
        process(arr, l, mid);
        process(arr, mid+1, r);
        mergeFix(arr, l, mid, r);

    }


    public void mergeFix(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];//令辅助数组的长度等于原数组
        int p1= left;
        int p2= mid + 1;
        int i = 0;
        while(p1<=mid && p2<=right){
            //下面这行代码，同时做了3件事
            //1.获取较小元素并放入help数组
            //2.help角标向右推进
            //3.左右区域指针向右推进
            help[i++]=arr[p1]<arr[p2] ? arr[p1++]:arr[p2++];
        }
        //下面两个while循环，只能满足一个，另一个无论如何都不会满足
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        while(p2<=right){
            help[i++]=arr[p2++];
        }
        //help的左边界是l，因此arr获取元素的时候，要从l边界开始，而不是0，这个地方容易出错
        for(int j=0;j<help.length;j++){
            arr[left+j]=help[j];
        }
    }


}
