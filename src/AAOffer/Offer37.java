package AAOffer;

import AAOffer.bean.*;

/**
 * @description:
 * @author: MuQinglin
 * @time: 2019/7/1 10:16
 */
public class Offer37 {

    //一个全局的计数变量，用于反序列化计数
    private static int index = 0;

    /*
     * @Description:序列化方法
     * @param: treenode 要序列化的二叉树根节点
     * @param: ser 一个空字符串，用来存放序列
     * @return: java.lang.String 序列化后的字符串
     * @Author: MuQinglin
     * @Date: 10:16 2019/7/1
     * @Version: 1.0
     */
    public String seriazlize(BinaryTreeNode treeNode, String ser) {
        if (treeNode == null) {
            return ser;
        }
        ser += treeNode.element;
        ser += ",";

        if (treeNode.left != null) {
            ser = seriazlize(treeNode.left, ser);
        } else {
            ser += "$";
        }
        if (treeNode.right != null) {
            ser = seriazlize(treeNode.right, ser);
        } else {
            ser += "$";
        }
        return ser;

    }

    /*
     * @Description:反序列化方法
     * @param: ser 序列通过","分割后形成的字符串数组
     * @return: AAOffer.bean.BinaryTreeNode 反序列化后的根节点
     * @Author: MuQinglin
     * @Date: 10:22 2019/7/1
     * @Version: 1.0
     */
    public BinaryTreeNode deSerialize(String[] ser) {
        if (ser == null || index >= ser.length) {
            return null;
        }
        String sNum = ser[index];
        BinaryTreeNode node = null;

        if (!sNum.equals("$")) {
            node = new BinaryTreeNode(Integer.parseInt(sNum));
            index++;
            node.left = deSerialize(ser);
            index++;
            node.right = deSerialize(ser);
        }

        return node;

    }
}
