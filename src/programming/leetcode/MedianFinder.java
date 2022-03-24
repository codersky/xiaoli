package programming.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.naturalOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {

        // max left of median
        int headOfMaxHeap = maxHeap.isEmpty() ? Integer.MIN_VALUE : maxHeap.peek();

        if(num <= headOfMaxHeap ){
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }

        if (maxHeap.size() - minHeap.size() == 2) {
            minHeap.add(maxHeap.poll());
        } else if(minHeap.size() - maxHeap.size() == 2) {
            maxHeap.add(minHeap.poll());
        }

    }

    public double findMedian() {
        double ans = 0.0;
        if (maxHeap.size() == minHeap.size()) {
            ans = ((minHeap.isEmpty() ? 0 : minHeap.peek()) / 2.0 + (maxHeap.isEmpty() ? 0 : maxHeap.peek()) / 2.0);
        } else {
            ans = maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
        }
        return ans;
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();
        mf.addNum(-1);
        mf.addNum(-2);
        System.out.println(mf.findMedian());
        mf.addNum(-3);
        mf.addNum(-4);
        mf.addNum(-5);
        System.out.println(mf.findMedian());
    }

}
