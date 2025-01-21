package ListInterface.Arraylist;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3



        System.out.println(list.get(2));
        System.out.println(list.size());
        list.add(2,6);
        list.remove(3);
        System.out.println();
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.indexOf(6));
        list.set(2,8);
        System.out.println(list);
        list.clear();
        System.out.println(list);




//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }




    }
}
