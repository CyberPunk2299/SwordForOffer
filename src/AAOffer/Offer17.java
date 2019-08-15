package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 20:53
 */
public class Offer17 {

    public static void PrintToMax(int n) {
        if (n < 1) return;
        char[] number = new char[n];
        for (int i = 0; i < 10; i++) {
            number[0] = (char) ('0' + i);
            printToMaxCore(number, 0);
        }
    }

    private static void printToMaxCore(char[] number, int index) {
        if (index == number.length - 1) {
            printNumber(number);
            return;
        }

        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) ('0' + i);
            printToMaxCore(number, index + 1);
        }
    }

    private static void printNumber(char[] number) {

        boolean isReady = false;

        for (int i = 0; i < number.length; i++) {
            if (!isReady && number[i] == '0') {//如果已经有一个元素非0，
                //那么以后的元素都可以打印输出
                continue;
            }
            isReady = true;
            System.out.print(number[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintToMax(5);
    }
}
