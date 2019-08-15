package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/9 15:39
 */
public class Offer67 {

    public int StrToInt(String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        char[] arr = str.toCharArray();
        long number = 0,ten = 1;
        int tenCount = arr.length - 1;
        boolean isNegative = false;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] == '-') {
                isNegative = true;
                tenCount--;
            } else if (i == 0 && arr[i] == '+') {
                isNegative = false;
                tenCount--;
            } else {
                if (arr[i] < '0' || arr[i] > '9') {
                    return 0;
                }
                int temp = arr[i] - '0';
                number += temp * Math.pow(10, tenCount);
                tenCount--;
            }
        }
        return isNegative ? -(int) number : (int) number;
    }

    public static void main(String[] args) {
        Offer67 offer67 = new Offer67();
        System.out.println(offer67.StrToInt("+123456"));
    }
}
