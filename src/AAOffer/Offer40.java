package AAOffer;

import java.util.InputMismatchException;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/1 19:57
 */
public class Offer40 {

    /*
     * @Description:快速排序，选择一个数，比它小的放左边，比它大的放右边
     * @param: arr
     * @param: left
     * @param: right
     * @return: int 中间数的下标
     * @Author: MuQinglin
     * @Date: 19:58 2019/7/1
     * @Version: 1.0
     */
    public static int partition(int[] arr, int left, int right) {
        if (left > right) {
            return -1;
        }
        int result = arr[left];

        while (left < right) {
            while (arr[left] < result) {
                left++;
            }//执行完毕后，arr[left] >= result

            arr[right] = arr[left];

            while (arr[right] >= result) {
                right--;
            }
            arr[left] = arr[right];
        }
        arr[left] = result;
        return left;

    }

    /*
     * @Description:
     * @param: a
     * @param: k
     * @return: int[]
     * @Author: MuQinglin
     * @Date: 20:28 2019/7/1
     * @Version: 1.0
     */
    public static int[] getLeastByK(int[] a, int k) {
        if (k == 0 || a == null || a.length == 0) {
            return null;
        }

        int start = 0, end = a.length - 1;
        int middle = partition(a, start, end);//中间元素的下标
        int[] outPut = new int[k];
        while (middle != k - 1) {
            if (middle < k - 1) {
                start = middle + 1;
                middle = partition(a, start, end);
            } else {
                end = middle - 1;
                middle = partition(a, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            outPut[i] = a[i];
        }
        return outPut;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int[] output = getLeastByK(arr, 4);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
    }
}
