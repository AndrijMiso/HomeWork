package homeWork009.StringBuilderRegax.HW01;

import java.util.Scanner;

public class Trimm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть речення з пробілами: ");
        String str = sc.nextLine();
        System.out.println();

        System.out.print("Done :");
        String newRe = str.replaceAll(" +", " " );
        System.out.println(newRe.trim());
    }
}
