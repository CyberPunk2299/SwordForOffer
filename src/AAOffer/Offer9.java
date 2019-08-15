package AAOffer;

import java.util.ArrayDeque;

/**
 * @description:两个栈实现一个队列
 * @author: ChenJianxuan
 * @time: 2019/6/26 11:31
 */
public class Offer9<AnyType> {
    ArrayDeque<AnyType> stackPush = new ArrayDeque<>();
    ArrayDeque<AnyType> stackPop = new ArrayDeque<>();

    /*
     * @Author: MuQinglin
     * @Description: 队尾添加一个元素
     * @Date: 11:35 2019/6/26
     * @param: null
     * @return:
     */
    public void append(AnyType value) {
        stackPush.addLast(value);
    }

    /*
     * @Author: MuQinglin
     * @Description: 删除函数
     * @Date: 11:35 2019/6/26
     * @param: null
     * @return:
     */
    public AnyType delete() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.addLast(stackPush.pollLast());
            }
        }
        return stackPop.pollLast();

    }
}
