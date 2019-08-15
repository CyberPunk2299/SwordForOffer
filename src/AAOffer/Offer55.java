package AAOffer;

import AAOffer.bean.BinaryTreeNode;

/**
 * @description:求二叉树的深度
 * @author: MuQinglin
 * @time: 2019/8/5 20:19
 */
public class Offer55 {
     /*
      * @Description: 问题1 二叉树的深度
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 11:07 2019/8/6
      * @Version: 1.0
      */

    public int getDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1:rightDepth + 1;
    }

     /*
      * @Description: 问题2 是否为平衡二叉树
      * @param: null
      * @return:
      * @Author: MuQinglin
      * @Date: 11:08 2019/8/6
      * @Version: 1.0
      */

    public int isBalanceTree(BinaryTreeNode root) {
        return 0;
    }




    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(5);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        BinaryTreeNode node3 = new BinaryTreeNode(7);
        BinaryTreeNode node4 = new BinaryTreeNode(2);
        BinaryTreeNode node5 = new BinaryTreeNode(4);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(8);
        node1.left = node2;
        node2.left = node4;
        node2.right = node5;
        node1.right = node3;
        node3.left = node6;
        node3.right = node7;
        Offer55 offer55 = new Offer55();
        System.out.println(offer55.getDepth(node1));
    }
}
