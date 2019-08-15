package AAOffer;

import java.util.ArrayDeque;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 19:27
 */
public class Offer30 {
    private ArrayDeque<Integer> mainStack;
    private ArrayDeque<Integer> helpStack;
    int min = 0;
    boolean isNotFirst = false;

    public Offer30() {
        this.mainStack = new ArrayDeque<>();
        this.helpStack = new ArrayDeque<>();
    }

    public void push(int value) {
        mainStack.push(value);
        if (!isNotFirst) {
            helpStack.push(value);
            min = value;
            isNotFirst = true;
            return;
        }
        if (value >= min)
            helpStack.push(min);
        else
            helpStack.push(value);
        return;

    }

    public int getMin() {
        return helpStack.pop();
    }

    public int pop() {
        helpStack.pop();
        return mainStack.pop();
    }

    public static void main(String[] args) {
        Offer30 offer = new Offer30();
        offer.push(1);
        offer.push(2);
        offer.push(3);
        offer.push(4);
        System.out.println(offer.getMin());
    }
}
