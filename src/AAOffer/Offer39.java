package AAOffer;

import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/1 15:54
 */
public class Offer39 {
    /*
     * @Description:
     * @param: a
     * @return: int
     * @Author: MuQinglin
     * @Date: 16:08 2019/7/1
     * @Version: 1.0
     */
    public static int findMoreThanHalf(int[] a) {
        int count = 0;
        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            if (temp == a[i]) {
                count++;
            } else {
                if (count == 0) {
                    temp = a[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 3, 3, 2, 5, 6};
        System.out.println(findMoreThanHalf(a));
    }
}
