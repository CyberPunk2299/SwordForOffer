package AAOffer;

import java.util.ArrayList;

class Test2 {
    public static final String a = "JD";

    static {
        System.out.print("OK");
    }

}

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/4 20:38
 */
public class aaa {

    private static int x = 10;
    private static Integer y = 10;

    public static void updateX(int x) {
        x = 3 * x;
    }

    public static void updateY(Integer value) {
        value = 3 * value;
    }

    public static void main(String[] args) {
        updateX(x);
        updateY(y);
        System.out.println(x);
        System.out.println(y);
    }

}

