package homeWork006ArraysLoops.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть 10 цілих чисел: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int six = sc.nextInt();
        int seven = sc.nextInt();
        int eight = sc.nextInt();
        int nine = sc.nextInt();
        int ten = sc.nextInt();

        if (one > 0 && two > 0 && three > 0 && four > 0 && five > 0) {
            System.out.println("Сумма перших пяти елементів: " + (one + two + three + four + five));
        } else {
            System.out.println("Добуток остніх пяти елементів: " + (six * seven * eight * nine * ten));
        }
    }
}
