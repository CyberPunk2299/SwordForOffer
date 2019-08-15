package AAOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @description:精髓在于数字与字符串的转换以及sort方法及比较器
 * @author: MuQinglin
 * @time: 2019/8/2 21:08
 */
public class Offer45 {

    public static void printMin(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int anArr : arr) {
            list.add(anArr);
        }
        list.sort((o1, o2) -> {
            String s1 = o1 + "" +o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });
        for (Integer alist : list) {
            System.out.print(String.valueOf(alist));
        }

    }

    public void printMin1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : arr) {
            list.add(integer);
        }
        list.sort((o1, o2) -> {
            String s1 = o1 + "" + o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,6,9,11,2,5,3,55,46};
        printMin(arr);
        System.out.println();
    }
}
