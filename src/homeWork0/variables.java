package homeWork0;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть першу змінну: ");
        a = sc.nextInt();
        System.out.print("Введіть другу змінну: ");
        b = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));

        System.out.print("How are you? ");
        String typeer = sc.nextLine();
        String typeer1 = sc.nextLine();
        System.out.println("You are " + typeer1);

        sc.close();
    }
}
