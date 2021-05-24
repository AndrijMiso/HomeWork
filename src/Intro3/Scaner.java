package Intro3;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Твоє перше авто: ");
        String model = sc.nextLine();

        System.out.print("Скільки км ти проїздив на авто: ");
        int km = sc.nextInt();

        System.out.println("Марка твого автомобіля: " + model);
        System.out.println("Ти проїздив: " + km + " тис. кілометрів");

        sc.close();
    }
}
