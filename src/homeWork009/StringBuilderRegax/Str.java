package homeWork009.StringBuilderRegax;

import java.util.Scanner;

public class Str  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть першу змінну: ");
        String str0 = sc.nextLine();
        System.out.print("Введіть другу змінну: ");
        String str1 = sc.nextLine();

        if (str1.contains(str0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
