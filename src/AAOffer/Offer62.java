package AAOffer;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 20:08
 */
public class Offer62 {
    //有错误
    public int solve1(int n, int m ) {
        if ( n < m) {
            throw new IllegalArgumentException("输入范围不对");
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        int deleteIndex = m - 1;
        while (linkedList.size() != 1) {
            System.out.println(linkedList.toString());
            linkedList.remove(2);
            deleteIndex = (deleteIndex + m - 1) % 5;

        }
        return linkedList.poll();
    }

    public int solve2(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        Offer62 offer62 = new Offer62();
        System.out.println(offer62.solve2(5,3));
    }
}
