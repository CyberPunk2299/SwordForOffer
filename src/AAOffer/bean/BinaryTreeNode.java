package AAOffer.bean;

/**
 * @description:为了方便调用，将所有内部属性设置为public，实际工作中是不允许的
 * @author: MuQinglin
 * @time: 2019/6/28 10:15
 */
//二叉树节点
public class BinaryTreeNode {

    public int element;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int nodeValue, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
        element = nodeValue;
        this.left = leftNode;
        this.right = rightNode;
    }

    public BinaryTreeNode(int nodeValue) {
        element = nodeValue;
        left = null;
        right = null;
    }

    /*
     * @Author: MuQinglin
     * @Description: 前序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    public static void preTraversalBinTree(BinaryTreeNode tree) {

        if (tree != null) {
            System.out.println(tree.element);
            preTraversalBinTree(tree.left);
            preTraversalBinTree(tree.right);
        }
    }

    /*
     * @Author: MuQinglin
     * @Description: 中序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    public static void inTraversalBinTree(BinaryTreeNode tree) {
        if (tree != null) {
            inTraversalBinTree(tree.left);
            System.out.println(tree.element);
            inTraversalBinTree(tree.right);
        }
    }

    /*
     * @Author: MuQinglin
     * @Description: 后序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    public static void postTraversalBinTree(BinaryTreeNode tree) {
        if (tree != null) {
            postTraversalBinTree(tree.left);
            postTraversalBinTree(tree.right);
            System.out.println(tree.element);
        }
    }

    /*
     * @Description:根据数组创造二叉树
     * @param:
     * @return:
     */
    public static BinaryTreeNode CreateBinaryTree(int[] a, int index) {
        BinaryTreeNode node = null;

        if (index < a.length) {
            Integer value = a[index];
            if (value == null) return null;

            node = new BinaryTreeNode(value);
            node.left = CreateBinaryTree(a, 2 * index + 1);
            node.right = CreateBinaryTree(a, 2 * index + 2);
            return node;
        }
        return node;
    }

    /*
     * @Description:返回一个简单的二叉树
     * @param:
     * @return:
     */
    public static BinaryTreeNode giveMeTree() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTreeNode node = CreateBinaryTree(a, 0);
        return node;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTreeNode node = CreateBinaryTree(a, 0);
        postTraversalBinTree(node);
        System.out.println("-------");
        inTraversalBinTree(node);
    }
}
