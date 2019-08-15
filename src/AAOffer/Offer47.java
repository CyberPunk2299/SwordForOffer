package AAOffer;

import java.util.Arrays;

/**
 * @description: 礼物的最大价值
 * @author: MuQinglin
 * @time: 2019/8/4 17:26
 */
public class Offer47 {

    /*
     * @Description:
     * @param: array 传入矩阵
     * @param: rows 行数
     * @param: cols 列数
     * @return: int 返回
     * @Author: MuQinglin
     * @Date: 20:32 2019/8/4
     * @Version: 1.0
     */
    public static int getMaxValue(int[] array, int rows, int cols) {
        if (array == null || rows <= 0 || cols <= 0) {
            return 0;
        }
        int[] maxValue = new int[cols];//记录每个位置的最大值
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int leftMax = 0, upMax = 0;
                if (i > 0) {
                    upMax = maxValue[j];
                }
                if (j > 0) {
                    leftMax = maxValue[j-1];
                }

                maxValue[j] = Math.max(leftMax, upMax) + array[i * cols + j];
            }
            System.out.println("第" + i + "行最大：" + Arrays.toString(maxValue));
        }
        return maxValue[cols - 1];
    }


    public static void main(String[] args) {
        int[] arr = {
                1,10,3,8,
                12,2,9,6,
                5,7,4,11,
                3,7,16,5};
        System.out.println(getMaxValue(arr, 4, 4));

    }
}
