package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/27 9:43
 */
public class Offer18 {

    public static void deleteNode(SingleListNode head, SingleListNode delNode) {
        if (head == null || delNode == null) {
            return;
        }
        if (delNode.next == null) {//是尾结点
            if (head.next == null) { //并且有一个头结点
                head.next = null;
                return;
            }
            deleteTailNode(head);
        } else {
            delNode.element = delNode.next.element;
            delNode.next = delNode.next.next;
        }

    }

    /*
     * @Description:删除尾结点
     * @param: null
     * @return:
     * @Author: MuQinglin
     * @Date: 9:50 2019/6/27
     */
    private static void deleteTailNode(SingleListNode head) {
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
    }

    /**
     * 打印链表的函数，方便测试效果
     *
     * @param root 链表头节点
     */
    public static void printListNode(SingleListNode root) {
        SingleListNode current = root;
        while (current != null) {
            System.out.print(current.element + ",");
            current = current.next;
        }
        System.out.println();
    }

    //测试
    public static void main(String[] args) {
        SingleListNode root = new SingleListNode(0);
        SingleListNode node1 = new SingleListNode(1);
        SingleListNode node2 = new SingleListNode(2);
        SingleListNode node3 = new SingleListNode(3);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;

        printListNode(root);
        deleteNode(root, node1);
        printListNode(root);
        deleteNode(root, root);
        printListNode(root);
        deleteNode(root, node3);
        printListNode(root);
    }
}
