package AAOffer;


/**
 * @description:常用的测试函数
 * @author: ChenJianxuan
 * @time: 2019/6/26 14:54
 */
public class Offer0 {

    protected static int getA(int n) {
        return n == 0 ? 0 : n + getA(n - 1);
    }


    public static void main(String[] args) {
        System.out.println(zeroCount(10));
    }


    /*
     * @Description:求斐波那契数组元素
     * @param: n    数组下标
     * @return: int 元素值
     * @Author: MuQinglin
     * @Date: 10:47 2019/7/2
     * @Version: 1.0
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        int one = 1;
        int two = 1;
        int three = 0;
        for (int i = 2; i <= n; i++) {
            three = one + two;
            one = two;
            two = three;
        }
        return three;
    }

    public static void sort(int[] a) {
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int j = 0, k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                b[j] = a[i];
                j++;
            } else {
                c[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < j; i++) {
            a[i] = b[i];
        }
        for (int i = 0; i < k ; i++) {
            a[i+j] = c[i];
        }
    }

     /*
      * @Description: 查找一个数的二进制数的含 0 个数
      * @param: 输入数
      * @return:
      * @Author: MuQinglin
      * @Date: 15:51 2019/7/18
      * @Version: 1.0
      */
    public static int zeroCount(int n ) {
        int zeroCount = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                zeroCount++;
            }
            n /= 2;
        }
        return zeroCount;
    }

}
