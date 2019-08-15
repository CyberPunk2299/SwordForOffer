package AAOffer;

public class Offer5 {

    public static String findSpace(String s) {
        if (s == null || s.length() == 0) return null;
        char[] sArray = s.toCharArray();
        int spaceCount = 0;
        for (char c : sArray) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        int length = sArray.length + spaceCount * 2;//新字符数组的长度
        char[] newArray = new char[length];
        length--;
        for (int i = sArray.length - 1; i >= 0; i--) {
            if (sArray[i] == ' ') {
                newArray[length--] = '0';
                newArray[length--] = '2';
                newArray[length--] = '%';
            } else {
                newArray[length--] = sArray[i];
            }
        }
        return new String(newArray);
    }

    public static void main(String[] args) {
        String s = " We are family. ";
        System.out.println(findSpace(s));

        String s1 = "       We are family. ";
        System.out.println(findSpace(s1));

        String s2 = " ";
        System.out.println(findSpace(s2));
    }
}
