package AAOffer;


import AAOffer.bean.BinaryTreeNode;

/**
 * @description:
 * @author: ChenJianxuan
 * @time: 2019/6/26 9:44
 */
public class Offer7 {
    /*
     * @Author: MuQinglin
     * @Description: 重建二叉树函数接口
     * @Date: 10:12 2019/6/26
     * @param: pre
     * @param: midd
     * @return: AAOffer.BinaryTreeNode
     */
    public static BinaryTreeNode rebuildTree(int[] pre, int[] midd) {
        if (pre == null || midd == null) {
            return null;
        }
        return rebuildCore(pre, midd, 0, pre.length - 1, 0, midd.length - 1);

    }

    /*
     * @Author: MuQinglin
     * @Description:
     * @Date: 10:12 2019/6/26
     * @param: pre      前序遍历数组
     * @param: midd     中序遍历数组
     * @param: pi   前序遍历数组下标
     * @param: pj   前序遍历数组下标
     * @param: mi   中序遍历下标i
     * @param: mj   中序遍历下标j
     * @return: AAOffer.BinaryTreeNode
     */
    public static BinaryTreeNode rebuildCore(int[] pre, int[] midd, int pi, int pj, int mi, int mj) {

        int rootValue = pre[pi];
        BinaryTreeNode tree = new BinaryTreeNode(rootValue, null, null);

        int rootPostion = 0;
        //查找根节点元素在中序数组下标位置
        for (rootPostion = 0; rootPostion < mj; rootPostion++) {
            if (rootValue == midd[rootPostion]) break;
        }
        int leftCount = rootPostion - mi;
        int rightCount = mj - rootPostion;
        if (leftCount > 0) {
            tree.left = rebuildCore(pre, midd, pi + 1, pi + leftCount, mi, rootPostion - 1);
        }
        if (rightCount > 0) {
            tree.right = rebuildCore(pre, midd, pi + leftCount + 1, pj, rootPostion + 1, mj);
        }
        return tree;
    }


    /*
     * @Author: MuQinglin
     * @Description: 主函数用于测试
     * @Date: 10:34 2019/6/26
     * @param: null
     * @return:
     */
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTreeNode tree = rebuildTree(pre, in);
        System.out.println("先序遍历结果:");
        preTraversalBinTree(tree);
        System.out.println();
        System.out.println("中序遍历结果:");
        inTraversalBinTree(tree);
        System.out.println();
        System.out.println("后序遍历结果:");
        postTraversalBinTree(tree);
    }

    /*
     * @Author: MuQinglin
     * @Description: 后序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    private static void postTraversalBinTree(BinaryTreeNode tree) {
        if (tree != null) {
            preTraversalBinTree(tree.left);
            preTraversalBinTree(tree.right);
            System.out.println(tree.element);
        }
    }

    /*
     * @Author: MuQinglin
     * @Description: 中序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    private static void inTraversalBinTree(BinaryTreeNode tree) {
        if (tree != null) {
            preTraversalBinTree(tree.left);
            System.out.println(tree.element);
            preTraversalBinTree(tree.right);
        }
    }

    /*
     * @Author: MuQinglin
     * @Description: 前序遍历
     * @Date: 10:33 2019/6/26
     * @param: null
     * @return:
     */
    private static void preTraversalBinTree(BinaryTreeNode tree) {

        if (tree != null) {
            System.out.println(tree.element);
            preTraversalBinTree(tree.left);
            preTraversalBinTree(tree.right);
        }
    }
}
