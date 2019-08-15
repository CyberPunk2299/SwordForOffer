package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description:链表中环的入口节点
 * @author: ChenJianxuan
 * @time: 2019/6/27 20:12
 */
public class Offer23 {
    /*
     * @Description:接口函数
     * @param:
     * @return:
     */
    public static SingleListNode findLoop(SingleListNode head) {
        if (head == null || head.next == null) return null;
        return findLoopCore(head);
    }

    /*
     * @Description:确定环的节点个数
     * @param:
     * @return:
     */
    private static SingleListNode findLoopCore(SingleListNode head) {
        int loopCount = hasLoop(head);
        System.out.println("环的节点个数为:" + loopCount);
        return loopCount == 0 ? null : findEnterLoop(head, loopCount);
    }

    /*
     * @Description:确认是否有环
     * @param:
     * @return:
     */
    private static int hasLoop(SingleListNode head) {
        SingleListNode first = head.next.next, second = head, temp = null;
        int loopCount = 1;

        while (first != second) {
            if (first.next == null) return 0;
            first = first.next.next;
            second = second.next;
        }

        temp = second;
        second = second.next;

        while (temp != second) {
            second = second.next;
            loopCount++;
        }
        return loopCount;

    }

    /*
     * @Description:找到环的入口
     * @param:
     * @return:
     */
    private static SingleListNode findEnterLoop(SingleListNode head, int loopCount) {
        SingleListNode first = head;
        SingleListNode second = head;
        for (int i = 0; i < loopCount; i++) {
            first = first.next;
        }
        while (first != second) {
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
        SingleListNode node5 = new SingleListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        node5.next=node3;
        System.out.println("环的入口节点值为:" + findLoop(node1).element);
    }
}
