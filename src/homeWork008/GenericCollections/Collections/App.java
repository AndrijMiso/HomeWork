package homeWork008.GenericCollections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Djek", 20));
        dogList.add(new Dog("Reks", 10));
        dogList.add(new Dog("Boby", 215));
        dogList.add(new Dog("Lyalya", 22));
        dogList.add(new Dog("Andrej", 99));
        dogList.add(new Dog("Shark", 2));

        System.out.println(dogList);

        System.out.println("---------------------------");
        System.out.println("Sorting compareTo В классі Dog (A-Z)");
        Collections.sort(dogList);
        for (Dog Numbersor: dogList) {
            System.out.println(Numbersor);
        }

        System.out.println("---------------------------");
        System.out.println("Sorting by name (A-Z) Внутрішній класс");
        Collections.sort(dogList,new Dog.ByName());
        for (Dog Numbersor1: dogList) {
            System.out.println(Numbersor1);
        }
        System.out.println("---------------------------");
        System.out.println("Sorting by AGE (1-9) Внутрішній класс");
        Collections.sort(dogList,new Dog.ByAge());
        for (Dog Numbersor1: dogList) {
            System.out.println(Numbersor1);
        }
    }


}
