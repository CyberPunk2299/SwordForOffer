package AAOffer;
import AAOffer.bean.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:二叉搜索树的第K大
 * @author: MuQinglin
 * @time: 2019/8/5 17:52
 */
public class Offer54 {
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private int count = 0;

    public int KthNode(BinaryTreeNode root, int k) {
        if (root == null || k <= 0) {
            throw new RuntimeException("root不能为null, k 不能为负数");
        }
        KthNodeCore(root, k);
        System.out.println("arraylist：" + arrayList.toString());
        return arrayList.get(count - k);
    }

    public void KthNodeCore(BinaryTreeNode root, int k) {
        if (root != null) {
            KthNodeCore(root.left, k);
            arrayList.add(root.element);
            count++;
            KthNodeCore(root.right, k);
        }
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
        Offer54 offer54 = new Offer54();
        System.out.println(offer54.KthNode(node1, 2));
        System.out.println(offer54.KthNode(null, 1));

    }

}
