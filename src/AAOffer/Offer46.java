package AAOffer;

/**
 * @description:数字翻译成字符串，又是斐波那契数列的变种
 * @author: MuQinglin
 * @time: 2019/8/4 16:25
 */
public class Offer46 {
    public static int getTranslationCount(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return getTranslationCount(Integer.toString(number));
    }

     /*
      * @Description:动态规划，从右向左计算
      * @param: 输入字符串
      * @return:
      * @Author: MuQinglin
      * @Date: 16:30 2019/8/4
      * @Version: 1.0
      */
    public static int getTranslationCount(String number) {
        int late1 = 1, late2 = 0, temp = 0, isSpilt = 0;//late1 上次，late2 上上次， temp 暂时， isSplit 是否分割
        for (int i = number.length()-2; i >= 0; i--) {
            if (Integer.parseInt(number.charAt(i) + "" + number.charAt(i+1)) < 26) {
                isSpilt = 1;
            } else {
                isSpilt = 0;
            }
            temp = late1;
            late1 = late1 + late2 * isSpilt;
            late2 = temp;
        }
        return late1;
    }



    public static void main(String[] args) {
        System.out.println(getTranslationCount(12258));
        System.out.println(getTranslationCount(-2));
        System.out.println(getTranslationCount(26));
    }
}
