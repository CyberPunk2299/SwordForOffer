package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 20:12
 */
public class Offer16 {

    public static double power(double base, int exponent) throws Exception {

        boolean isNegative = false;
        if (base == 0 && exponent < 0) {
            throw new Exception("pow(0,0)");
        }
        if (exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        if (exponent < 0) {
            isNegative = true;
            exponent = (-exponent);
        }
        double result = powerWith(base, exponent);
        if (isNegative) {
            result = 1 / result;
        }
        return result;
    }

    /*
     * @Description:
     * @param: null
     * @return:
     * @Author: MuQinglin
     * @Date: 20:25 2019/6/26
     */
    private static double powerWith(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        double result = powerWith(base, exponent >> 1);//先计算exponent/2的数值
        result *= result;//结果*结果

        if (exponent % 2 == 1) { //如果为奇数
            result *= base;//最后多乘一个base
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(power(10, -1));
    }
}
