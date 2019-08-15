package AAOffer;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;

/**
 * @description:证明一个数组是不是二叉搜索树后序遍历
 * @author: MuQinglin
 * @time: 2019/6/28 21:31
 */
public class Offer33 {

    /*
     * @Description:是不是后序遍历
     * @param:
     * @return:
     */
    public static boolean isPost(int[] seq, int start, int end) {

        if (seq == null || seq.length <= 0) return false;
        if (start == end || end - start == 1) return true;

        int root = seq[end];

        //判断是不是根左右结构
        int firstRight = 0;
        for (; firstRight < end; firstRight++) {
            if (seq[firstRight] > root) break;
        }

        //判断是不是根左右结构
        int j = firstRight;
        for (; j < end; j++) {
            if (seq[j] < root) return false;
        }

        boolean left = false;
        if (firstRight > start)
            return isPost(seq, start, firstRight - 1);

        boolean right = false;
        if (firstRight < end)
            return isPost(seq, firstRight, end - 1);

        return left && right;
    }

    /*
     * @Description:是不是前序遍历
     * @param: seq   传入数组
     * @param: start 首元素下标
     * @param: end 尾元素下标
     * @return: boolean
     * @Author: MuQinglin
     * @Date: 10:04 2019/6/29
     */
    public static boolean isPre(int[] seq, int start, int end) {

        if (seq == null || seq.length <= 0) return false;

        if (start == end || end - start == 1) return true;
        int root = seq[start];//得到根元素

        int firstRight = start + 1;
        for (; firstRight <= end; firstRight++) {
            if (seq[firstRight] > root) break;
        }

        int j = firstRight;
        for (; j <= end; j++) {
            if (seq[j] < root) return false;
        }

        boolean left = false;
        if (firstRight > start + 1) return isPre(seq, start + 1, firstRight - 1);

        boolean right = false;
        if (firstRight < end) return isPre(seq, firstRight, end);
        return left && right;


    }


    public static void main(String[] args) {
        int[] a = {5, 7, 6, 9, 11, 10, 8};
        System.out.println(isPost(a, 0, a.length - 1));
        int[] b = {8, 6, 5, 7, 10, 9, 11};
        System.out.println(isPre(b, 0, b.length - 1));
    }
}
