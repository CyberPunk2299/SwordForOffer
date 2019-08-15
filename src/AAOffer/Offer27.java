package AAOffer;

import AAOffer.bean.*;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 10:38
 */
public class Offer27 {

    public static BinaryTreeNode MirrorTree(BinaryTreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return null;

        //交换节点
        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        MirrorTree(root.left);
        MirrorTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode tree1 = new BinaryTreeNode(0);
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        tree1.left = node1;
        tree1.right = node2;
        System.out.println(tree1.element);
        System.out.println(tree1.left.element);
        System.out.println(tree1.right.element);


        BinaryTreeNode node3 = MirrorTree(tree1);

        System.out.println(tree1.element);
        System.out.println(tree1.left.element);
        System.out.println(tree1.right.element);
    }
}
