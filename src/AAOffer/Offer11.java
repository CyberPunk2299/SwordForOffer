package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 15:04
 */
public class Offer11 {
    /**
     * 主方法，对外的接口，用于处理数组为空或者数组大小小于1的特殊情况
     *
     * @param arr 数组
     * @return 最小的数
     * @throws Exception 数组输入错误
     */
    public static int getMini(int[] arr) throws Exception {
        if (arr == null || arr.length <= 0)
            throw new Exception("数组输入错误");
        else
            return getMini(arr, 0, arr.length - 1);
    }

    /**
     * 核心方法。找到并返回最小值
     *
     * @param arr   数组
     * @param start 起始位置
     * @param end   终点位置
     * @return 最小数
     */
    public static int getMini(int[] arr, int start, int end) {
        //start<end 针对数组只有一个元素的特殊情况，此时start=end
        //arr[start]>=arr[end] 针对数组本身递增的特殊情况
        while (start < end && arr[start] >= arr[end]) {
            int mid = (start + end) / 2;
            if (arr[start] > arr[mid])       //比中间元素大，说明中间元素在前半截
                return getMini(arr, start, mid);
            else if (arr[start] < arr[mid])  //比中间元素小，说明中间元素在后半截
                return getMini(arr, mid + 1, end);
            else
                return arr[mid + 1];
        }
        return arr[start];
    }

    public static int getMin(int[] a, int start, int end) {
        while (start < end && a[start] >= a[end]) {
            int mid = (start + end) / 2;//得到中间元素下标
            if (a[start] > a[mid]) {
                return getMin(a, start, mid);
            } else if (a[start] < a[mid]) {
                return getMin(a, mid + 1, end);
            } else {
                return a[mid + 1];
            }
        }
        return a[start];
    }
}
