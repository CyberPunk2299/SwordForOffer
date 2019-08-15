package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 19:58
 */
public class Offer15 {

    /*
     * @Description:查找1的个数
     * @param: 输入常数
     * @return:
     * @Author: MuQinglin
     * @Date: 20:01 2019/6/26
     */
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = (n - 1) & n;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-10));
    }
}
