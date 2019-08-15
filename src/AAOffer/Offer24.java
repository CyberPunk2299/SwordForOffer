package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/27 20:43
 */
public class Offer24 {

    /*
     * @Description:翻转链表的接口函数
     * @param:
     * @return:
     */
    public static SingleListNode reverseList(SingleListNode head) {
        if (head == null) {
            return null;
        }

        SingleListNode pre = null;
        SingleListNode cur = head;
        SingleListNode nex = head.next;

        if (head.next == null) return head;
        return reverseListCore(pre, cur, nex);
    }

    /*
     * @Description:翻转链表的核心函数
     * @param:
     * @return:
     */
    private static SingleListNode reverseListCore(SingleListNode pre, SingleListNode cur, SingleListNode nex) {
        cur.next = null;
        while (nex != null) {
            pre = cur;
            cur = nex;
            nex = nex.next;
            cur.next = pre;
        }
        System.out.println("反转后的head元素为:" + cur.element);
        return cur;
    }

    /*
     * @Description:正序打印链表
     * @param:
     * @return:
     */
    public static void displayList(SingleListNode head) {
        while (head != null) {
            System.out.println(head.element);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        SingleListNode node1 = new SingleListNode(1);
        SingleListNode node2 = new SingleListNode(2);
        SingleListNode node3 = new SingleListNode(3);
        SingleListNode node4 = new SingleListNode(4);
        SingleListNode node5 = new SingleListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        displayList(reverseList(node1));
    }
}
