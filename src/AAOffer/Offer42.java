package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/2 10:12
 */
public class Offer42 {

    /*
     * @Description:获得连续数组的最大和
     * @param: a
     * @return: int
     * @Author: MuQinglin
     * @Date: 10:13 2019/7/2
     * @Version: 1.0
     */
    public static int getContinMax(int[] a) {
        if (a == null || a.length <= 0) return -1;

        int tempMax = 0;
        int Max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                if (tempMax < 0) {
                    tempMax = a[i];
                } else {
                    tempMax += a[i];
                    if (tempMax > Max) {
                        Max = tempMax;
                    }
                }
            } else {
                Max = tempMax;
                tempMax += a[i];
            }

        }
        return Max;
    }

    public static void main(String[] args) {
        int[] a = {2, -2, 2, -4, 6, 5};
        System.out.println(getContinMax(a));
    }
}
