package ListInterface.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        Node node1 = new Node();
//        Node node2 = new Node();
//        node1.value = 1;
//        node2.value = 2;
//        node1.next = node2;
//        node2.next = null;

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(6);
        list.addLast(8);
        System.out.println(list);
//        list.removeFirst();
//        list.removeLast();
        list.removeIf(x -> x%2==0);
        System.out.println(list);


    }




}
class Node{
    public int value;
    public Node next;
}