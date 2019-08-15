package AAOffer;

import AAOffer.bean.SingleListNode;

/**
 * @description: 两个链表的第一个公共节点
 * @author: MuQinglin
 * @time: 2019/8/5 16:23
 */
public class Offer52 {
    public static SingleListNode findFirstCommonNode(SingleListNode list1, SingleListNode list2) {
        int nodeCountList1 = 0, nodeCountList2 = 0;
        SingleListNode temp1 = list1, temp2 = list2;
        while (temp1.next != null) {
            nodeCountList1++;
            temp1 = temp1.next;
        }
        while (temp2.next != null) {
            nodeCountList2++;
            temp2 = temp2.next;
        }
        
        if (nodeCountList1 < nodeCountList2) {
            temp1 = list2;
            temp2 = list1;
        }
        for (int i = 0; i < Math.abs(nodeCountList1 - nodeCountList2); i++) {
            temp1 = temp1.next;
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}




















