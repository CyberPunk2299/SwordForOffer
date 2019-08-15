package AAOffer;

import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 11:08
 */
public class Offer57 {

     /*
      * @Description:问题1
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 16:01 2019/8/8
      * @Version: 1.0
      */

    public int[] solve1(int[] arr, int k) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        int ahead = 0,behind = arr.length - 1;
        while (ahead != behind){
            int sum = arr[ahead] + arr[behind];
            if (sum == k) {
                break;
            } else {
                if (sum < k) {
                    ahead++;
                } else {
                    behind--;
                }
            }
        }
        int[] result = {arr[ahead], arr[behind]};
        return result;
    }

    public void solve2(int sum) {
        if (sum < 2) {
            return;
        }
        int start = 1, end = 2, middle = (sum + 1) / 2;

        while (start < middle) {
            int tempSum = start;
            for (int i = start + 1; i <= end; i++) {
                tempSum += i;
            }
            if (tempSum == sum) {
                System.out.println("start = " + start + ", end = " + end);
                start++;
            } else {
                if (tempSum > sum) {
                    start++;
                } else {
                    end++;
                }
            }
        }
    }




    public static void main(String[] args) {
        int[] question1 = {1,2,4,7,11,15};
        Offer57 offer57 = new Offer57();
        System.out.println(Arrays.toString(offer57.solve1(question1,15)));

        offer57.solve2(15);



    }
}
