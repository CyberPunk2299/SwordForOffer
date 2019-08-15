package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 21:51
 */
public class Offer65 {
    public int solve(int m, int n) {
        int sum = 0, carry = 0;
        while (n != 0) {
            sum = m ^ n;
            carry = (m & n) << 1;
            m = sum;
            n = carry;
        }
        return sum;
    }

    public static void main(String[] args) {
        Offer65 offer65 = new Offer65();
        System.out.println(offer65.solve(5,2));
    }
}
