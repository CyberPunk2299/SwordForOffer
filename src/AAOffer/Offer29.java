package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 15:32
 */
public class Offer29 {

    /*
     * @Description:循环打印矩阵的外部接口
     * @param:
     * @return:
     */
    public static void printCycli(int[][] a) {
        if (a.length == 0 || a == null) return;
        int count = a.length / 2 + 1;
        for (int i = 0; i < count; i++) {
            printCycliCore(a, i, i);
        }
    }

    /*
     * @Description:写程序时，一定要把几个具有标志性的，经常变化的标志给提取出来，否则会非常混乱
     * @param:血淋淋的教训！！！！！！！！！
     * @return:
     */
    public static void printCycliCore(int[][] a, int i, int j) {

        int startI = i, endI = a.length - 1 - i, startJ = j, endJ = a[i].length - 1 - j;
        //起始行下标，终止行下标，起始列下标，终止列下标
        while (j <= endJ) System.out.println(a[i][j++]);
        i++;
        while (i <= endI) System.out.println(a[i++][endJ]);
        for (j = endJ - 1; j >= startJ; ) System.out.println(a[endI][j--]);
        for (i = endI - 1; i >= startI + 1; ) System.out.println(a[i--][startJ]);

    }

    public static void main(String[] args) {
        int[][] a = {{11, 12, 13, 14, 15},
                {26, 27, 28, 29, 16},
                {25, 34, 35, 30, 17},
                {24, 33, 32, 31, 18},
                {23, 22, 21, 20, 19}};
        printCycli(a);
    }
}
