package ListInterface.Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name ;
    private double gpa ;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
public class comparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("nishant",6.99));
        students.add(new Student("sudershan",8.00));
        students.add(new Student("aditya",7.9));
        students.add(new Student("adyaaa",7.98));
        // aditya  pranav
        // 7.98    8.50


        students.sort((o1,o2) -> {
            if((o2.getGpa() - o1.getGpa()>0)){
                return 1;
            }if((o2.getGpa() - o1.getGpa()<0)){
                return -1;
            }else {
                return o1.getName().compareTo(o2.getName());
            }
        });

//        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort(comparing);
        for(Student s : students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }


    }
}
