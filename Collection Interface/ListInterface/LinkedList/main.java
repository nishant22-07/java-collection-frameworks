package ListInterface.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {


        LinkedList<String> Animals = new LinkedList<>(Arrays.asList("Elephant","dog","tiger","Lion"));
        LinkedList<String> AnimalsToremove = new LinkedList<>(Arrays.asList("dog","Lion"));
        System.out.println(Animals);
        Animals.removeAll(AnimalsToremove);
        System.out.println(Animals);
    }
}
