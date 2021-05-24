package homeWork006ArraysLoops.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] month1 = {29, 31, 30, 28, 40, 15, 30, 31, 32, 33, 31, 30};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число місяця (1-12): ");
        int num = sc.nextInt();
        int k = 0;
        for (int i = 0; i < month.length; i++) {
            if (num == month[i]) {
                num = month1[i];
                k = month[i];
            }
        }
        sc.close();
        System.out.println("Кількість днів у "+ k +" місяці: " +num);
    }
}
