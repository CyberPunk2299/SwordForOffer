package AAOffer;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Offer6 {
    class Node {
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node createNode(int ele) {
        return new Node(ele);
    }

    public void printReven(Node head) {
        if (head == null) {
            return;
        }
        //创建一个栈
        ArrayDeque<Integer> array = new ArrayDeque<>();

        while (head != null) {
            array.add(head.getElement());
            head = head.getNext();
        }
        Iterator<Integer> iterator = array.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        Offer6 offer = new Offer6();
        Node root1 = offer.createNode(1);
        Node root2 = offer.createNode(2);
        Node root3 = offer.createNode(3);

        root1.setNext(root2);
        root2.setNext(root3);
        offer.printReven(root1);
    }
}
