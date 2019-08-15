package AAOffer;

import java.util.Arrays;

/**
 * @description:第一个只出现一次的字符
 * @author: MuQinglin
 * @time: 2019/8/5 15:33
 */
public class Offer50 {
    public static char getFirstOneCharacter(String str) {
        if (str == null || str.length() < 1) {
            return ' ';
        }
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            charCount[temp]++;
        }
        for (int i = 0; i < str.length(); i++) { //注意遍历的是原str，保证不按字母表顺序
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }



    public static void main(String[] args) {
        System.out.println(getFirstOneCharacter("abccbb"));
        System.out.println(getFirstOneCharacter("aaabbb"));
        System.out.println(getFirstOneCharacter(""));
        System.out.println(getFirstOneCharacter("zbba"));
    }
}
