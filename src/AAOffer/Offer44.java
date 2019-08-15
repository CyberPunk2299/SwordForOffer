package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/2 19:16
 */
public class Offer44 {


    /*
     * @Description:找到是几位数
     * @param: n
     * @return: double
     * @Author: MuQinglin
     * @Date: 20:23 2019/7/2
     * @Version: 1.0
     */
    public static int findNumberCount(double n) {
        if (n <= 9) {
            return (int) n;
        }
        double sum = 1, lastSum = 0;
        int i = 0;
        for (i = 0; sum < n; i++) {
            lastSum = sum;
            sum = sum + i * 9 * Math.pow(10, i - 1);
        }
        i--;//此时i表示几位数
        int minNumber = (int) Math.pow(10, i - 1);//得到最小数字
        int count = (int) (n - lastSum);//得到字符数
        int rest = count % i;//得到剩余的字符位置
        int number = count / i + minNumber - 1;//得到最近的数字

        int finalNumber = (rest == 0 ? number : number + 1);
        String charNumber = Integer.toString(finalNumber);
        return rest == 0 ? charNumber.charAt(i - 1) - '0' : charNumber.charAt(rest - 1) - '0';
    }


    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println("当前为第" + i + "个数： " + findNumberCount(i));
        }


    }
}
