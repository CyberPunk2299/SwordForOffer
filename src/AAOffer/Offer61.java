package AAOffer;

import java.util.Arrays;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 19:41
 */
public class Offer61 {

    //网上大神的思路是真清晰
    public boolean solve(int[] arr) {
        if (arr == null || arr.length < 5) {
            return false;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int hasZero = 0, needZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                hasZero++;
            }
        }
        int small = hasZero;
        int big = hasZero + 1;
        while (big < arr.length) {
            if (arr[small] == arr[big]) {
                return false;
            }
            needZero += arr[big++] - arr[small++] - 1;
        }
        return hasZero >= needZero ? true : false;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,2,4,5};
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.solve(arr));
    }
}
