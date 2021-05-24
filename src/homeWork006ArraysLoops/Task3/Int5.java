package homeWork006ArraysLoops.Task3;

import java.util.Scanner;

public class Int5 {
    public static void main(String[] args) {
        int[] five = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть пять чисел");
        five[0] = sc.nextInt();
        five[1] = sc.nextInt();
        five[2] = sc.nextInt();
        five[3] = sc.nextInt();
        five[4] = sc.nextInt();

        int pozitiontwo = 0;

        for (int i = 0; i < five.length; i++) {
            if (five[i] > 0 ) {
                    if (five [i+1] > 0) {
                        pozitiontwo = five[i+1];
                        break;
                }
            }
        }
        System.out.println("Position of second positive number: " + pozitiontwo);
        int index = 0;
        int minimum = 0;
        for (int i = 0; i < five.length; i++) {
            if (five[i] < minimum) {
                minimum = five[i];
                index = i;
            }
        }
        System.out.println("Minimum and its position in the array: " + minimum);
        System.out.println("Index minimum: " + index);


        /*
        Організуйте введення цілих чисел до першого від’ємного числа.
         */

        int[] arr = new int [4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введіть " + i + " Число: ");
            arr[i] = sc.nextInt();
            if ( arr[i] < 0) {
                System.out.println("Ви ввели відємне число.");
                break;
            }
        }

        /*
        Підрахуйте добуток усіх введених парних чисел.
         */
        int dobutok = 0;
        for (int parnux: arr) {
            if (parnux > 0) {
                if ((parnux % 2) == 0) {
                    dobutok = dobutok + parnux;
                }
            }
        }
        System.out.println("The product of all even numbers: " + dobutok);
    }
}
