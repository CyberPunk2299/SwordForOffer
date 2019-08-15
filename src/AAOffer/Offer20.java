package AAOffer;

/**
 * @description: 判断字符串是否表示数值，非常好的业务逻辑题
 * @author: ChenJianxuan
 * @time: 2019/6/27 15:30
 */
public class Offer20 {

    private int index = 0;//索引

    //主方法
    public boolean isNumber(String number) {

        if (number == null) return false;//字符串null

        char[] numArr = number.toCharArray();//转换成字符数组
        boolean result = false;

        if (numArr[0] == '.') {  //如果首元素为'.'
            result = commonCode(numArr);
        } else {
            result = scanA(numArr);
            if (result && index != numArr.length) {
                if (index == numArr.length - 1) { //索引到最后一个元素
                    return numArr[index] == '.';//123.也正确
                }
                if (numArr[index] == '.') {
                    result = commonCode(numArr);
                } else {
                    ++index;
                    result = scanC(numArr);
                }
            }
        }
        return result;
    }

    //首元素为"."时的检查
    private boolean commonCode(char[] numArr) {

        ++index;

//        if(index == numArr.length //只有一个元素
//                || numArr[index]=='e' //e或者E
//                || numArr[index]=='E')return false;

        if (index == numArr.length //只有一个元素，此时index指向'.'后面的元素
                || numArr[index] < '0'  //小数点后的第一个元素不能不是数字
                || numArr[index] > '9') return false;

        boolean result = scanB(numArr);//判断小数点后第一个元素是数字的情况下，遍历到最后，截止到Ee,结束

        if (result && index != numArr.length) { //确定为截止到E，e
            if (index == numArr.length - 1) return false; //如果e，E是最后一个元素
            ++index;
            result = scanC(numArr);
        }

        return result;
    }

    //扫描A
    private boolean scanA(char[] num) {
        if (num[index] == '+' || num[index] == '-') {//当前元素为+-
            ++index;
            if (index == num.length) return false;//如果+-是最后一个元素
        }

        while (index < num.length && num[index] >= '0' && num[index] <= '9') ++index;

        return index == num.length  //index能不能遍历到最后
                || num[index] == '.'   //截止到.
                || num[index] == 'e'   //截止到e，或者E
                || num[index] == 'E';
    }

    //扫描B
    private boolean scanB(char[] num) {
        while (index < num.length
                && num[index] >= '0'
                && num[index] <= '9') ++index;

        return index == num.length  //遍历到最后、截止到eE，都视为正确
                || num[index] == 'e'
                || num[index] == 'E';
    }

    //扫描C
    private boolean scanC(char[] num) {
        if (num[index] == '+' || num[index] == '-') { //如果e后面跟的是+-号
            ++index;
            if (index == num.length) return false; //如果+-号是最后的元素
        }

        while (index < num.length && num[index] >= '0' && num[index] <= '9')//当元素位于0~9之间
            ++index;

        return index == num.length;//是否遍历到最后
    }

    public static void main(String[] args) {
        Offer20 instance = new Offer20();
        String[] arr = {"0.33e4", ".3456E0", "23524.2456", "8526985", "928.",
                "24536.000", "3453e245", "3456E45"}; //都是合格的
        String[] err = {"0.33e4e", ".345a6E0", "23524.24.56", "85e269E85", ".",
                ".E", "0.235E", ".e324", "E", "2345.e34", "e"}; // 都是不合格的
        for (String s : arr) {
            if (!instance.isNumber(s)) {
                System.out.println(s + " failure");
                //break;
            } else {
                System.out.println(s + " success");
            }
            instance.index = 0;

        }

        System.out.println("==============================");

        for (String s : err) {
            if (!instance.isNumber(s)) {
                System.out.println(s + " failure");
                //break;
            } else {
                System.out.println(s + " success");
            }
            instance.index = 0;
        }
    }

}
