package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/5 10:00
 */
public class Offer49 {

     /*
      * @Description:判断是不是丑数
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 10:00 2019/8/5
      * @Version: 1.0
      */
    public static boolean isUgly(int number) {
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return (number == 1) ? true:false;
    }

    public static int getUglyByIndex(int index) {
        int count = 0, number = 0;
        while (count < index) {
            number++;
            if (isUgly(number)) {
                count++;
            }
        }
        return number;
    }








     /*
      * @Description:获取丑数
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 11:47 2019/8/5
      * @Version: 1.0
      */
    public static int getUglyNumber(int index) {
        if (index < 1) {
            return -1;
        }
        int T2 = 0, T3 = 0, T5 = 0;
        int nextUgly = 0;//下一个丑数
        int[] uglyNumbers = new int[index];
        uglyNumbers[0] = 1;

        for (int i = 1; i < index; i++) {
            nextUgly = getMin(2*uglyNumbers[T2], 3*uglyNumbers[T3], 5*uglyNumbers[T5]);
            uglyNumbers[i] = nextUgly;
            while (2*uglyNumbers[T2] <= nextUgly) {
                T2++;
            }
            while (3*uglyNumbers[T3] <= nextUgly) {
                T3++;
            }
            while (5*uglyNumbers[T5] <= nextUgly) {
                T5++;
            }
        }
        return uglyNumbers[index-1];
    }
     /*
      * @Description:求 3 个数里面的最大值
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 11:41 2019/8/5
      * @Version: 1.0
      */

    public static int getMin(int number1, int number2, int number3) {
        int min = Math.min(number1, number2);
        return Math.min(min, number3);
    }



    public static void main(String[] args) {
        System.out.println(getUglyNumber(1500));
        System.out.println(getUglyByIndex(1500));
    }
}
