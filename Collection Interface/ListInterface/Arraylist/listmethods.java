package ListInterface.Arraylist;

import java.util.*;
class myComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
class myStringComparator1 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

public class listmethods {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(7);
        list.add(3);
        list.add(0,0);
        System.out.println(list);

        //converting list to array
//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array1));

        //sorting list of integers
//        Collections.sort(list);
//        list.sort(new myComparator() );
        //sorting using lambda expression
        list.sort((a,b) -> a-b);
        System.out.println(list);


//        List<Integer> integers = List.of(4, 5, 6, 7, 8, 9);
//        list.addAll(integers);
//        System.out.println(list);

//        list.remove(Integer.valueOf(1));//removing element in array by value not by index
//        System.out.println(list);



        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("kivi");
        fruits.add("banana");
        System.out.println(fruits);

        //sorting list of Strings
//        fruits.sort(new myStringComparator1());


        //sorting using lambda expression
        fruits.sort((a,b) -> a.length()-b.length());
        System.out.println(fruits);

//        fruits.remove("apple");
//        System.out.println(fruits);

    }
}
