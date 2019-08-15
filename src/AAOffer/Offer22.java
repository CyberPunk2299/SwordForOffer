package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/27 19:19
 */

public class Offer22 {


    /*
     * @Description:
     * @param:
     * @return:
     */
    public static SingleListNode findNode(SingleListNode head, int k) {
        if (head == null || k <= 0) return null;
        return findNodeCore(k, head);
    }

    /*
     * @Description:查找节点的核心函数，当second合适的时候赋值head不合适。
     * @param:
     * @return:
     */
    private static SingleListNode findNodeCore(int k, SingleListNode head) {
        SingleListNode first = head;
        SingleListNode second = head;
        for (int i = 1; i < k; i++) {
            if (first.next == null) return null;
            first = first.next;
        }
        while (head.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    public static void main(String[] args) {
        SingleListNode node1 = new SingleListNode(1);
        SingleListNode node2 = new SingleListNode(2);
        SingleListNode node3 = new SingleListNode(3);
        SingleListNode node4 = new SingleListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(findNode(node1, 5).element);
    }

}
