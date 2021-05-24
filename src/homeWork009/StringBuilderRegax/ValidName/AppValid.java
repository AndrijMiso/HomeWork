package homeWork009.StringBuilderRegax.ValidName;

import java.util.Scanner;

public class AppValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidName valid = new ValidName();

        for (int i = 0; i < 5; i++) {
            valid.name(sc.nextLine());
        }
        sc.close();
    }
}
