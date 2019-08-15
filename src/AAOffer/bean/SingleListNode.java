package AAOffer.bean;

/**
 * @description:单链表节点，为了方便调用，将所有内部属性设置为public，实际工作中是不允许的
 * @author: MuQinglin
 * @time: 2019/6/28 10:14
 */
public class SingleListNode {
    public SingleListNode next;
    public int element;

    public SingleListNode(int element) {
        this.element = element;
    }
}
