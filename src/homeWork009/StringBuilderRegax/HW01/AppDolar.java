package homeWork009.StringBuilderRegax.HW01;

import java.util.Scanner;

public class AppDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatternDolar p = new PatternDolar();
        for ( int i = 0 ; i < 3 ; i++) {
            System.out.println("Введіть сумму: ");
            String st = sc.nextLine();
            p.dollar(st);
        }
    }
}
