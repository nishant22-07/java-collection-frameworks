package ListInterface.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        //.aslist method return fixed sized list in which you can not add anything extra
        // but you can modify using .set() method
        List<String> list1 = Arrays.asList("monday", "tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1,"saturday");
        System.out.println(list1);

        String[] array = {"appele" , "banana" , "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2);
        System.out.println(list2.getClass().getName());

        List<String> list3 = new ArrayList<>(list2);
        list3.add("nishant");
        System.out.println(list3);

        // List.of() method is unmodifiable means you can not replace or add the element in  this list
        List<Integer> integers = List.of(1, 2, 3, 4);





    }
}
