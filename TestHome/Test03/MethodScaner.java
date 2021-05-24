package Test03;

import java.util.Scanner;

public class MethodScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodScaner t1 = new MethodScaner();

        System.out.println("Веведіть числа які хочете додати: ");
        t1.concat(sc.nextInt(), sc.nextInt());

        System.out.println("Введіть числа яка потрібно поділити: ");
        t1.dilenya(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    private void concat (int a, int b) {
        int res = a + b;
        System.out.println("A + B = " + res);
    }

    private void dilenya (int a, int b) {
        int res = a / b;
        System.out.print("A / B = " + res);
    }
}
