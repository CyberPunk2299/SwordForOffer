package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 15:04
 */
public class Offer10 {

    /*
     * @Author: MuQinglin
     * @Description: 效率最低的斐波那契数列
     * @Date: 15:10 2019/6/26
     * @param: 数列下标
     * @return:
     */
    public static int Fibonacci(int n) {
        if (n < 0) {
            throw new RuntimeException("请输入大于等于0的数");
        }
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /*
     * @Description:从下往上的斐波那契数列
     * @param:
     * @return:
     * @Author: MuQinglin
     * @Date: 15:24 2019/6/26
     */
    public static int quickFibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
        }
        int pre1 = 0, pre2 = 1, fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = pre1 + pre2;
            pre1 = pre2;
            pre2 = fn;
        }
        return fn;
    }

    /*
     * @Description: 员工年龄排序
     * @param: null
     * @return:
     * @Author: MuQinglin
     * @Date: 15:51 2019/6/26
     */
    public static int[] ageSort(int[] a) {
        int maxAge = 99;
        int[] ageArr = new int[maxAge + 1];
        for (int i = 0; i < a.length; i++) ageArr[a[i]]++;

        int leng = 0;
        for (int i = 0; i < ageArr.length; i++) {
            for (int j = 0; j < ageArr[i]; j++) {
                a[leng++] = i;
            }
        }
        return a;

    }

    /*
     * @Description:简单的测试函数
     * @param: args
     * @return: void
     * @Author: MuQinglin
     * @Date: 15:23 2019/6/26
     */
    public static void main(String[] args) {
        System.out.println(Fibonacci(0));
        System.out.println(quickFibonacci(0));
        int[] a = new int[5];
        for (int i = 0; i < 2; i++) {
            a[i] = 10;
        }
        for (int i = 2; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------");
        a = ageSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
