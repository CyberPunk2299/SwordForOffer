package AAOffer.bean;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/29 13:39
 */
public class ComplexListNode {
    public ComplexListNode next;
    public ComplexListNode sibling;
    public int value;

    public ComplexListNode(int value) {
        this.value = value;
    }

    public ComplexListNode() {
        this.next = null;
        this.sibling = null;
    }
}
