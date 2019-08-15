package AAOffer;

import javax.print.DocFlavor;

/**
 * @description:字符串匹配
 * @author: ChenJianxuan
 * @time: 2019/6/27 10:56
 */
public class Offer19SSS {

    //外部接口
    public static boolean match(String str, String pattern) {
        if (str == null || pattern == null) return false;
        if (str.equals("") && pattern.equals("")) return true;
        return matchCore(str, 0, pattern, 0);
    }

    //
    private static boolean matchCore(String str, int strIndex, String pattern, int ptnIndex) {

        //出口1，遍历完了
        if (strIndex == str.length() && ptnIndex == pattern.length()) return true;

        //出口2，str遍历完，p没完，继续判断p的第二位是不是‘*’
        if (strIndex == str.length() && ptnIndex != pattern.length()) {
            if (ptnIndex + 1 < pattern.length() && pattern.charAt(ptnIndex + 1) == '*')
                return matchCore(str, strIndex, pattern, ptnIndex + 2);
            else
                return false;
        }

        //出口3，s没完，p完了
        if (strIndex != str.length() && ptnIndex == pattern.length())
            return false;

        //第二个字符是*
        if (ptnIndex + 1 < pattern.length() && pattern.charAt(ptnIndex + 1) == '*') {
            //第一个字符匹配
            if (pattern.charAt(ptnIndex) == '.'
                    || str.charAt(strIndex) == pattern.charAt(ptnIndex)) {
                return matchCore(str, strIndex + 1, pattern, ptnIndex + 2)//匹配1次
                        || matchCore(str, strIndex + 1, pattern, ptnIndex) //匹配多次
                        || matchCore(str, strIndex, pattern, ptnIndex + 2);//匹配0次
            } else
                return matchCore(str, strIndex, pattern, ptnIndex + 2);
        }

        //第二个字符不是*
        if (pattern.charAt(ptnIndex) == '.' || str.charAt(strIndex) == pattern.charAt(ptnIndex))
            return matchCore(str, strIndex + 1, pattern, ptnIndex + 1);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(match("aaa", "a*a"));
    }
}
