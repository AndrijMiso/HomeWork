package homeWork0;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ВВедіть ціни: ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        System.out.println("Введіть хвилини");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        sc.close();

        System.out.println("Дзвінок с1*t1 = " + (c1 * t1));
        System.out.println("Дзвінок с1*t2 = " + (c1 * t2));
        System.out.println("Дзвінок с1*t3 = " + (c1 * t3));
        System.out.println("Усі хвилини = " + (c1 * (t1 * t2 * t3)));

        System.out.println();

        System.out.println("Дзвінок с2*t1 = " + (c2 * t1));
        System.out.println("Дзвінок с2*t2 = " + (c2 * t2));
        System.out.println("Дзвінок с2*t3 = " + (c2 * t3));
        System.out.println("Усі хвилини =  " + (c2 * t1 * t2 * t3));

        System.out.println();

        System.out.println("Дзвінок с3*t1 = " + (c3 * t1));
        System.out.println("Дзвінок с3*t2 = " + (c3 * t2));
        System.out.println("Дзвінок с3*t3 = " + (c3 * t3));
        System.out.println("Усі хвилини = " + (c3 * t1 * t2 * t3));

    }
}
