package homeWork3OOP;

import java.util.Scanner;

/**
 * Створіть проект консольної програми на Java.
 * Додайте клас Person до проекту.
 * Клас Людина повинна складатися з
 * три приватні поля: Ім'я, Прізвище та Рік народження (рік народження)
 * властивості для доступу до цих полів
 * конструктор за замовчуванням та конструктор з 2 параметрами (ім’я та прізвище)
 * методи:
 * getAge () - для обчислення віку людини
 * input () - для введення інформації про людину
 * output () - для виведення інформації про людину
 * changeName (String fn, String ln) - щоб змінити ім'я або / та прізвище особи
 *
 * У методі main () створіть 5 об'єктів типу Person та введіть про них інформацію.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 0;
    }

    ///////Methods/////////
    int getAge() {
        return (2021 - this.birthYear);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть інформацію про людей");
        System.out.print("Введіть Імя: ");
        this.firstName = sc.nextLine();
        System.out.print("Введіть Прізвище: ");
        this.lastName = sc.nextLine();
        System.out.print("Введіть рік народження: ");
        this.birthYear = sc.nextInt();
    }

    void output() {
        System.out.println("Інформація про людину:");
        System.out.println("Імя: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Рік народження: " + birthYear);
        System.out.println("РОків: " + getAge());
        System.out.println("----------------------------------");
    }

    private void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();

        Person p2 = new Person();
        p2.input();


        p1.output();
        p2.output();

        Person p5 = new Person("Roman", "roman");
        p5.output();

        p5.changeName("Vasil", "romanovich");
        p5.output();

    }




















}
