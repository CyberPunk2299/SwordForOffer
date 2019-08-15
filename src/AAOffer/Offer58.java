package AAOffer;

import java.util.Arrays;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/8/8 16:20
 */
public class Offer58 {

    //问题1
    public String solve1(String s) {
        char[] arr = s.toCharArray();
        reverseChar(arr,0,arr.length-1);

        int start = 0, end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' && i < end) {
                reverseChar(arr, start,i-1);
                start = i + 1;

            }
        }
        return new String(arr);
    }

    public void reverseChar(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //问题二：左旋转字符串
    public String solve2(char[] arr, int n) {
        if (arr == null) {
            return null;
        }
        reverseChar(arr, 0, n - 1);
        reverseChar(arr, n, arr.length - 1);
        reverseChar(arr, 0, arr.length - 1);
        return new String(arr);
    }



    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();
        String s = "i am a student.";
        System.out.println(offer58.solve1(s));

        String s1 = "abcdefg";
        System.out.println(offer58.solve2(s1.toCharArray(), 2));

    }
}
