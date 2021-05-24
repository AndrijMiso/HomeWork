package homeWork008.GenericCollections.Collections;


import java.util.Comparator;

public class Dog implements Comparable<Dog> {

    public static class ByName implements Comparator<Dog> {
        @Override
        public int compare(Dog do1, Dog do2) {
            return do1.getName().compareTo(do2.getName());
        }
    }

    public static class ByAge implements Comparator<Dog> {
        @Override
        public int compare(Dog do1, Dog do2) {
            return do1.getAge() - do2.getAge();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog NAME) {
        return name.compareTo(NAME.getName());
        //return NAME.getAge() - age;
    }

    @Override
    public String toString() {
        return "Dog[ " +
                "name=' " + name + '\'' +
                ", age= " + age +
                ']';
    }
}