package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/2 10:34
 */
public class Offer43 {
    public static int count(int n) {
        if (n < 1)
            return 0;
        int count = 0;
        int base = 1;
        int round = n;
        while (round > 0) {
            int weight = round % 10;
            round /= 10;
            count += round * base;
            if (weight == 1)
                count += (n % base) + 1;
            else if (weight > 1)
                count += base;
            base *= 10;
        }
        return count;
    }

    public static int getCount(Integer n) {
        int tempN = n;
        int count = 0;
        int base = 1;
        while (tempN > 0) {
            if (tempN % 10 == 0) {
                count += (tempN / 10) * base;
            } else if (tempN == 1) {
                count += (tempN / 10) * base + 1;
            } else if (tempN > 1) {
                count += ((tempN / 10) + 1) * base;
            }
            tempN = tempN / 10;
            base *= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(2354));
        System.out.println(getCount(2354));
    }
}
