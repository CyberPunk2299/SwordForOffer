package AAOffer;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/1 11:02
 */
public class Offer38 {


    /*
     * @Description:字符串的排列
     * @param: a
     * @param: index 前遍历索引
     * @return: null
     * @Author: MuQinglin
     * @Date: 11:05 2019/7/1
     * @Version: 1.0
     */
    public static void sortString(char[] str, int index) {

        if (index == str.length - 1) { //达到尾元素位置
            System.out.println(String.valueOf(str));
        } else {
            for (int j = index; j < str.length; j++) {

                //进行一次交换
                char temp = str[index];
                str[index] = str[j];
                str[j] = temp;

                sortString(str, index + 1);

                //交换回来
                temp = str[index];
                str[index] = str[j];
                str[j] = temp;

            }
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        sortString(s.toCharArray(), 0);
    }
}
