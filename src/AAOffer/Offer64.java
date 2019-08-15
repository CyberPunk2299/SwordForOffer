package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 21:38
 */
public class Offer64 {
    public int solve1(int n) {
        int sum = n;
        boolean flag = (n > 1) && ((sum += solve1(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Offer64 offer64 = new Offer64();
        System.out.println(offer64.solve1(100));
    }
}
