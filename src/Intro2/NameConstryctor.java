package Intro2;

public class NameConstryctor {
    public static void main(String[] args) {
        Person andriy = new Person(180 ,81.5f); //Створюю новий обєкт andriy - класу Person (обєкт класу Person)
///         andriy.height = 180;
///         andriy.weight = 81.5f;
        System.out.println("Weight andriy is " + andriy.weight + " kg");
        System.out.println("Height andriy is " + andriy.height + " cm");

        System.out.println("-----------------------------------------------");

        Person maks = new Person(); //Створюю новий обєкт maks - класу Person (обєкт класу Person)
        maks.height = 150;
        maks.weight = 70f;
        System.out.println("Weight maks is " + maks.weight + " kg");
        System.out.println("Height maks is " + maks.height + " cm");
    }
}
