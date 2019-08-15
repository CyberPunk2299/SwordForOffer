package AAOffer;

import AAOffer.bean.*;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/29 13:38
 */
public class Offer35 {

    public static void CloneNodes(ComplexListNode head) {
        ComplexListNode CloneNode = head;
        while (CloneNode != null) {
            ComplexListNode newNode = new ComplexListNode();

            newNode.value = CloneNode.value;
            newNode.next = CloneNode.next;
            newNode.sibling = null;

            CloneNode.next = newNode;
            CloneNode = newNode.next;
        }
    }

    public static void ConnectSibNodes(ComplexListNode head) {
        ComplexListNode phead = head;
        while (phead != null) {
            if (phead.sibling != null)
                phead.next.sibling = phead.sibling.next;
            phead = phead.next.next;
        }
    }

    public static ComplexListNode splitCompleNodes(ComplexListNode head) {
        ComplexListNode pNode = head;
        ComplexListNode cloneHead = null;
        ComplexListNode cloneNode = null;

        if (pNode != null) {
            cloneHead = cloneNode = pNode.next; //A''
            pNode.next = cloneNode.next;//
            pNode = pNode.next; //B
        }

        while (pNode != null) {
            cloneNode.next = pNode.next;
            cloneNode = cloneNode.next;//B'
            pNode.next = cloneNode.next;
            pNode.next = pNode.next;
        }
        return cloneHead;
    }
}
