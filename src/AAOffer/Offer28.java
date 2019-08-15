package AAOffer;

import AAOffer.bean.*;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 14:53
 */
public class Offer28 {
    public static boolean isSymmetrical(BinaryTreeNode root) {
        return isSymmetricalCore(root, root);
    }

    /*
     * @Description:镜像对比的执行函数
     * @param:
     * @return:
     */
    private static boolean isSymmetricalCore(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        if (root1.element != root2.element) return false;

        return isSymmetricalCore(root1.left, root2.right) && isSymmetricalCore(root1.right, root2.left);
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1};
        BinaryTreeNode node = BinaryTreeNode.CreateBinaryTree(a, 0);
        node.preTraversalBinTree(node);
        System.out.println(isSymmetrical(node));
    }
}
