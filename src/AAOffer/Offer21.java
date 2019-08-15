package AAOffer;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/27 18:37
 */
public class Offer21 {

    /*
     * @Description:提供判断函数的接口
     * @param:
     * @return:
     */
    public static int[] adjustSort(int[] a) {
        if (a == null) throw new RuntimeException("null指针错误");
        return SortCore(a);
    }


    /*
     * @Description:对数组进行奇偶数的排序
     * @param:
     * @return:
     */
    private static int[] SortCore(int[] a) {
        int temp;
        if (a.length <= 1) return a;
        int start = 0, end = a.length - 1;//初始下标、最后元素下标
        while (start < end) {
            while (start < end && judge(a[start])) start++;
            while (start < end && !judge(a[end])) end--;
            if (start < end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        return a;
    }

    /*
     * @Description:判断函数进行抽离
     * @param:
     * @return:
     */
    private static boolean judge(int n) {
        return n % 2 == 1 ? true : false;
    }


    /*
     * @Description:简单的测试函数
     * @param:
     * @return:
     */
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        a = adjustSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
