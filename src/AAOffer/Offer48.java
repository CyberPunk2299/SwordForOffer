package AAOffer;

import jdk.nashorn.internal.ir.IfNode;

import java.time.temporal.IsoFields;
import java.util.Arrays;

/**
 * @description: 最长不含重复字符的子字符串
 * @author: MuQinglin
 * @time: 2019/8/4 21:04
 */
public class Offer48 {

    public static int longestSubStringLength(String str) {
        if (str == null || str.length() <1) {
            return -1;
        }

        int[] position = new int[26];
        int curLength = 0, maxLength = 0;
        for (int i = 0; i < position.length; i++) {
            position[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int preIndex = position[str.charAt(i) - 'a'];
            if (preIndex < 0 || i - preIndex > curLength) { //第一次取值或者 长度大于
                curLength++;
            } else {
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
                curLength = i -preIndex;
            }
            position[str.charAt(i) - 'a'] = i;
        }
        if (curLength > maxLength) {
            maxLength = curLength;
        }
        return maxLength;
    }


    public static void main(String[] args) {
        String s = "arabcacfr";
        System.out.println(longestSubStringLength(s));
    }
}
