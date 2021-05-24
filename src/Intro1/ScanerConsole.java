package Intro1;

import java.util.Scanner;

public class ScanerConsole {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Set to number");

        int a;
        a = num.nextInt();
        System.out.println("My Variable: " + a);

    }
}
