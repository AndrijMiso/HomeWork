package homeWork004EnumPracticalTask.Task01;

import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int q = sc.nextInt();
        System.out.print("Введіть Друге число: ");
        int w = sc.nextInt();
        System.out.print("Введіть третє число: ");
        int e = sc.nextInt();

        int parne = 0;
        int neparne = 0;

        if (q % 2 == 0) {
            parne++;
        } else {
            neparne++;
        }
        if (w % 2 == 0) {
            parne++;
        } else {
            neparne++;
        }
        if (e % 2 == 0) {
            parne++;
        } else {
            neparne++;
        }

        System.out.println("Непарних " + neparne + " числа.");
        System.out.println("Парних " + parne + " числа.");
    }
}
