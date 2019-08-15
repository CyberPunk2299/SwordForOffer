package AAOffer;

//数组的长度是固定的，因为是内存中划分出来的一段连续的空间
//数组没有赋值的话会默认赋值，因此用循环遍历得size的方式并不可取。除非
//实际元素都!=0
public class Offer5a {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 3;
        arr[2] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
