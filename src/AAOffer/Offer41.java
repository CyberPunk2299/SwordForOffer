package AAOffer;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/1 21:18
 */
public class Offer41 {
    private int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    /*
     * @Description:插入最大堆，最小堆，并进行平衡
     * @param: num  待插入数字
     * @return: void
     * @Author: MuQinglin
     * @Date: 21:34 2019/7/1
     * @Version: 1.0
     */
    public void insert(int num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    /*
     * @Description:获取中位数
     * @param:
     * @return: int
     * @Author: MuQinglin
     * @Date: 21:37 2019/7/1
     * @Version: 1.0
     */
    public int getMiddle() {
        if (count % 2 == 0) {
            return (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return minHeap.peek();
        }
    }

    /*
     * @Description:测试函数
     * @param: args
     * @return: void
     * @Author: MuQinglin
     * @Date: 21:41 2019/7/1
     * @Version: 1.0
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 9};
        Offer41 offer41 = new Offer41();
        for (int i = 0; i < a.length; i++)
            offer41.insert(a[i]);
        System.out.println(offer41.getMiddle());
    }
}
