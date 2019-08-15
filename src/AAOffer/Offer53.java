package AAOffer;

import java.lang.reflect.Array;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/5 17:00
 */
public class Offer53 {

    public int getCountOfKey(int[] array, int key) {
        int number = 0;
        if (array != null && array.length > 0) {
            int firstIndex = getFirstKeyLocation(array, 0, array.length, key);
            int lastIndex = getLastKeyLocation(array, 0, array.length, key);
            if (lastIndex > -1 && firstIndex > -1) {
                number = lastIndex - firstIndex;
            }
        }
        return number + 1;
    }




    public int getFirstKeyLocation(int[] array, int start, int end, int key) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (key < array[middle] || (key == array[middle] && array[middle - 1] == key)) {
                return getFirstKeyLocation(array, start, middle -1, key);
            }
            if (key > array[middle]) {
                return getFirstKeyLocation(array, middle + 1, end, key);
            }
            if (key == array[middle]) {
                return middle;
            }
        }

        return -1;
    }

    public int getLastKeyLocation(int[] array, int start, int end, int key) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (key > array[middle] || (key == array[middle] && array[middle + 1] == key)) {
                return getLastKeyLocation(array, middle + 1, end, key);
            }
            if (key < array[middle]) {
                return getLastKeyLocation(array, start, middle - 1, key);
            }
            if (key == array[middle]) {
                return middle;
            }
        }
        return -1;
    }

     /*
      * @Description:查找数值与数组下标相同的元素
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 11:02 2019/8/6
      * @Version: 1.0
      */
    public int solve3(int[] arr, int start, int end) {
        int middle = (start + end) / 2;
        if (arr[middle] > middle) {
            return solve3(arr,start, middle - 1);
        }
        if (arr[middle] < middle) {
            return solve3(arr, middle + 1, end);
        }
        if (arr[middle] == middle) {
            return arr[middle];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,6};
        Offer53 offer53 = new Offer53();
        System.out.println(offer53.getCountOfKey(arr, 2));
        System.out.println(offer53.solve3(arr,0,arr.length));
    }
}
