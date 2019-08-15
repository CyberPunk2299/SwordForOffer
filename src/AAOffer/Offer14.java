package AAOffer;


import java.util.ArrayList;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/23 16:54
 */
public class Offer14 {
    /*
     * @Description:基于动态规划
     * @param: len 绳子长度
     * @return: int 最大乘积
     * @Author: MuQinglin
     * @Date: 16:55 2019/7/23
     * @Version: 1.0
     */
    public static int maxAfterCutting_Solution1(int len) {
        if (len < 2) {
            return 0;
        }
        if (len == 2) {
            return 1;
        }
        if (len == 3) {
            return 2;
        }

        int[] products = new int[len+1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;

        int max = 0;
        for (int i = 4; i <= len; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int product = products[j]*products[i-j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        return products[len];
    }
    /*
     * @Description: 基于贪婪算法的思想，尽可能多的减 3 的绳子
     * @param: len
     * @return: int
     * @Author: MuQinglin
     * @Date: 9:56 2019/7/24
     * @Version: 1.0
     */
    public static int maxAfterCutting_Solution2(int len) {
        if (len < 2) {
            return 0;
        }
        if (len == 2) {
            return 1;
        }
        if (len == 3) {
            return 2;
        }
        int countOf3 = len / 3;

        if (len % 3 == 1) {
            countOf3--;
        }
        int countOf2 = ( len - 3 * countOf3 ) / 2;
        return (int)(Math.pow(3, countOf3) * Math.pow(2, countOf2));
    }

    public static void main(String[] args) {
        System.out.println(maxAfterCutting_Solution2(9));
        System.out.println(maxAfterCutting_Solution1(5));

    }
}
