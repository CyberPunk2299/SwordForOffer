package AAOffer;

import AAOffer.bean.*;

import java.util.ArrayDeque;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 20:26
 */
public class Offer32 {

    /*
     * @Description:不分行从上往下打印二叉树
     * @param:
     * @return:
     */
    public static void PrintUpDown(BinaryTreeNode root) {
        if (root == null) return;
        ArrayDeque<BinaryTreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(root);

        while (!arrayDeque.isEmpty()) {//非空
            BinaryTreeNode node = arrayDeque.pollFirst();
            System.out.println(node.element + " ");
            if (node.left != null) arrayDeque.addLast(node.left);
            if (node.right != null) arrayDeque.addLast(node.right);
        }

    }

    /*
     * @Description:分层打印
     * @param:
     * @return:
     */
    public static void PrintEachLevel(BinaryTreeNode root) {
        if (root == null) return;
        ArrayDeque<BinaryTreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(root);

        BinaryTreeNode last = root; // 当前遍历层的最右边界节点
        BinaryTreeNode nextLast = null; // 当前层的下一层的最右边界节点

        while (!arrayDeque.isEmpty()) {//非空
            BinaryTreeNode node = arrayDeque.pollFirst();
            System.out.print(node.element + " ");

            if (node.left != null) {
                arrayDeque.addLast(node.left);
                nextLast = node.left;
            }
            if (node.right != null) {
                arrayDeque.addLast(node.right);
                nextLast = node.right;
            }
            if (node == last && !arrayDeque.isEmpty()) {
                System.out.print("\n");
                last = nextLast;
            }
        }
    }
}
