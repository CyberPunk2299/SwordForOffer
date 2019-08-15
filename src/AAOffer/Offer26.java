package AAOffer;

import AAOffer.bean.BinaryTreeNode;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/28 9:56
 */
public class Offer26 {
    /*
     * @Description:判断有没有相同的子节点
     * @param:
     * @return:
     */
    public static boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.element == root2.element) {
                result = hasSameTree(root1.left, root2.left);
            }
            if (!result) result = hasSubtree(root1.left, root2);
            if (!result) result = hasSubtree(root1.right, root2);
        }
        return result;
    }

    /*
     * @Description:判断节点下的子节点是否相同
     * @param:
     * @return:
     */
    private static boolean hasSameTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null || root2 == null) return false;
        if (root1.element != root2.element) return false;
        return hasSameTree(root1.left, root2.left) && hasSameTree(root1.right, root2.right);
    }

}
