package AAOffer;

import javax.xml.transform.Result;
import java.util.Arrays;

/**
 * @description:数组中数字出现的次数
 * @author: MuQinglin
 * @time: 2019/8/6 11:15
 */
public class Offer56 {

    //题目一：数组中只出现一次的两个元素
    public  int[] solve1(int[] data) {
        if (data == null || data.length < 2 ) {
            return null;
        }
        int resultExclusiveOR = 0,length = data.length;
        for (int i = 0; i < length; i++) {
            resultExclusiveOR ^= data[i];
        }

        int firstIndex1 = findFirstBitIs(resultExclusiveOR);
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < length; i++) {
            if (isBit1(data[i], firstIndex1)) {
                number1 ^= data[i];
            } else {
                number2 ^= data[i];
            }
        }
        int[] result = {number1, number2};
        return result;

    }

    //找到第一个位数为1的位
    public int findFirstBitIs(int num) {

        int indexBit = 0;
        while ((num & 1) == 0 && (indexBit < 8 * num) ) {
            num = num >> 1;
            indexBit++;
        }
        return indexBit;
    }

    //根据传入的数及右移位数判断该位是不是1
    public  boolean isBit1(int num, int indexBit) {
        num = num >> indexBit;
        return (num & 1) == 1;
    }


    //问题2：数组中唯一只出现一次的数字
    public int solve2(int[] arr) {
        if (arr == null || arr.length < 4) {
            throw new IllegalArgumentException("请输入有效的信息");
        }
        int negative = 0;
        int[] count = new int[32];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0 && negative == 0) {
                negative = 1;
            }
            for (int j = 31; j >= 0; j--) {
                count[j] += arr[i] & 1;
                arr[i] >>= 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int result = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] % 3;
            stringBuilder.append(count[i]);
        }
        String s = stringBuilder.toString();

        if (negative == 1) {
                s = s.replace('1','2');
                s = s.replace('0','1');
                s = s.replace('2','0');
                result = Integer.parseInt(s,2) + 1;
        } else {
            result = Integer.parseInt(s,2);
        }

        return negative == 1 ? -result : result;
    }





    public static void main(String[] args) throws Exception{
        Offer56 offer56 = new Offer56();
        int[] question1 = {1,2,2,3,3,4};
        System.out.println(Arrays.toString(offer56.solve1(question1)));

        int[] question2 = {-6,2,2,2,3,3,3};
        System.out.println(offer56.solve2(question2));
    }

}
