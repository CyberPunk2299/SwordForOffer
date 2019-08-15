package AAOffer;

public class Offer4 {

    //二维数组的查找
    public static boolean find(int[][] arr, int x) {
        //行号下标，以及列号下标
        int row = 0, column = arr[0].length - 1;

        while (row < arr.length && column >= 0) {
            int item = arr[row][column];
            if (item < x) {
                row++;
            } else if (item > x) {
                column--;
            } else {
                return true;
            }
        }
        return false;
    }
}
