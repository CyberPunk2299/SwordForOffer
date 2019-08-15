package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description:合并两个排序的链表，精髓在于新建链表3
 * @author: ChenJianxuan
 * @time: 2019/6/27 21:34
 */
public class Offer25 {

    /*
     * @Description:合并两个排序的链表的核心函数
     * @param:
     * @return:
     */
    private static SingleListNode mergeCore(SingleListNode head1, SingleListNode head2) {

        if (head1 == null) return head2;
        else if (head2 == null) return head1;

        SingleListNode headTemp = null;

        if (head1.element < head2.element) {
            headTemp = head1;
            headTemp.next = mergeCore(head1.next, head2);
        } else {
            headTemp = head2;
            headTemp.next = mergeCore(head1, head2.next);
        }
        return headTemp;
    }
}
