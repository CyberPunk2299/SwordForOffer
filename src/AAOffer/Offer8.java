package AAOffer;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 11:00
 */
public class Offer8 {

    class Node<T> {
        Node<T> left;
        Node<T> right;
        Node<T> father;
        T element;

        public Node(T val) {
            this.element = val;
        }
    }

    /*
     * @Author: MuQinglin
     * @Description:    找出下一个节点
     * @Date: 11:02 2019/6/26
     * @param: node
     * @return: AAOffer.Offer8.Node
     */
    public Node findNext(Node target) {

        if (target.right != null) {// 有右孩子，此时为遍历根
            Node head = target.right;
            while (head.left != null) head = head.left;  //找到右孩子的最左孩子
            return head;
        } else if (target.father == null) return null;  //父节点为空
        else if (target == target.father.left) { //有父亲，是父亲的左孩子
            return target.father;
        } else if (target == target.father.right) {  //有父亲，是父亲的右孩子
            Node father = target.father;
            Node grand = father.father;
            while (father != grand.left) {
                father = grand;
                grand = grand.father;
            }
            return grand;
        } else {
            return null;
        }
    }
}
