package programming.leetcode;

public class FindMedianIn2Array {

    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        double ans = 0.0;

        int total = nums1.length + nums2.length;
        int midIndex = total/2 + 1;

        int j = 0;
        int k = 0;
        int i = j + k;
        int [] rslt = new int[midIndex];

        while (i < midIndex) {
            if( j < nums1.length && k < nums2.length && nums1[j] <= nums2[k]) {
                rslt[i] = nums1[j];
                j++;
            } else if (j < nums1.length && k < nums2.length && nums1[j] > nums2[k]){
                rslt[i] = nums2[k];
                k++;
            } else if (j < nums1.length){
                rslt[i] = nums1[j];
                j++;
            } else if (k < nums2.length){
                rslt[i] = nums2[k];
                k++;
            }
            i++;
        }

        if((total & 1) == 1){
            ans = rslt[midIndex-1];
        } else {
            ans = (rslt[midIndex-1] + rslt[midIndex - 2]) * 0.5;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArray(nums1, nums2));
    }
}
