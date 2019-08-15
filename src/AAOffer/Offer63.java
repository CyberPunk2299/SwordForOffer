package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 21:25
 */
public class Offer63 {

    public int solve(int[] arr) {
        int maxValue = 0, min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i]) {
                int temp = arr[i] - min;
                if (maxValue < temp) {
                    maxValue = temp;
                }
            } else {
                min = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {9,11,8,5,7,12,16,14};
        Offer63 offer63 = new Offer63();
        System.out.println(offer63.solve(arr));
    }
}
