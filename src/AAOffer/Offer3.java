package AAOffer;


public class Offer3 {

    //1、找出数组中重复的数字
    public static int findDuplicate(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            while (a[i] != i) {
                if (a[i] == a[a[i]]) {
                    return a[i];
                }
                temp = a[i];
                a[i] = a[a[i]];
                a[temp] = temp;
            }
        }
        return -1;
    }

    //2、不修改数组找出重复的数字，采用二分法
    public static int findDuplicate2(int[] arr) {
        int start = 1, end = arr.length - 1;

        while (start <= end) {
            int middle = (end - start) / 2 + start;

            //统计个数
            int count = count(arr, start, middle);
            if (start == end) {
                if (count > 1) return start;
                break;
            }
            if (count > middle - start + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    //统计数组在某一范围内的元素个数
    public static int count(int[] arr, int low, int high) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= low && arr[i] <= high) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int[] arr2 = {2, 3, 4, 0, 5, 5, 6};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate2(arr2));
    }
}
