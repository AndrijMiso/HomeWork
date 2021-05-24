package homeWork009.StringBuilderRegax;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть Імя - Прізвище - ПоБатькові: ");
        String res = sc.nextLine();

        String[] arrString = res.split(" ");


        System.out.println("#1 Прізвище та ініціали");
        System.out.println(arrString[1]+ " " + arrString[0].charAt(0)+ ". " + arrString[2].charAt(0)+ ".");

        System.out.println("#2 Імя");
        System.out.println(arrString[0]);

        System.out.println("#3 Імя по батькові та прізвище");
        System.out.println(arrString[0]+ " " + arrString[2]+ " " + arrString[1]);
    }
}
