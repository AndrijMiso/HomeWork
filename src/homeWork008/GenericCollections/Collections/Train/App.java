package homeWork008.GenericCollections.Collections.Train;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add( new Student("Maks", 3));
        students.add( new Student("Andrej", 2));
        students.add( new Student("Pavlo", 1));
        students.add( new Student("Ivan", 3));
        students.add( new Student("Jerby", 2));

        System.out.println(students);

        Collections.sort(students , new Student.ByName());
        for(Student good : students) {
            System.out.println(good);
        }

        ///////////////////////////////////////////////////
        ////Practical Task 1.1
        System.out.println("--------------------------");
//        List<Integer> myArrList  = new ArrayList<>(10);
//        List<Integer> myNewArrList = new ArrayList<>();
//        List<Integer> myRemoveArrList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Scanner sc = new Scanner(System.in);
//            Integer s = sc.nextInt();
//            myArrList.add(s);
//            if(s > 5) {
//                myNewArrList.add(s);
//            }
//            if (s < 20) {
//                myRemoveArrList.add(s);
//            }
//
//        }
//        System.out.println(myArrList);
//        System.out.println("--------------------------");
//        System.out.println("Add Arr List s>5 \n " +myNewArrList);
//        System.out.println("---------------------------");
//        System.out.println("Remove Arr List s>20 \n" +myRemoveArrList);


        Set<Student> s = new HashSet<>();
        s.add(new Student("Andrej", 4));
        s.add(new Student("Maks", 2));
        s.add(new Student("Andrej", 4));
        s.add(new Student("Pavlo", 1));

        for (Student st : s) {
            System.out.println(st);
        }


    }
}
