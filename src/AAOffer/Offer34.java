package AAOffer;

import AAOffer.bean.*;

import java.util.Stack;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/6/29 11:28
 */
public class Offer34 {
    /**
     * 求路径的核心方法
     *
     * @param treeNode 二叉树
     * @param num      特定整数
     * @param sum      当前的和
     * @param stack    存放之前路径的栈
     */
    public static void getSpecifiedPath(BinaryTreeNode treeNode,
                                        int num, int sum,
                                        Stack<BinaryTreeNode> stack) {
        stack.push(treeNode);
        sum += treeNode.element;

        if (treeNode.left == null && treeNode.right == null && num == sum) {
            for (BinaryTreeNode binaryTreeNode : stack) {
                System.out.print(binaryTreeNode.element + " ");
            }
            System.out.println();
        }

        if (treeNode.left != null)
            getSpecifiedPath(treeNode.left, num, sum, stack);
        if (treeNode.right != null)
            getSpecifiedPath(treeNode.right, num, sum, stack);

        stack.pop();
        sum -= treeNode.element;
    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(10);
        BinaryTreeNode node2 = new BinaryTreeNode(5);
        BinaryTreeNode node3 = new BinaryTreeNode(12);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        getSpecifiedPath(node1, 22, 0, new Stack<>());
    }
}
