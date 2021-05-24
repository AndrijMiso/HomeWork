package homeWork0;

import java.util.Scanner;

public class define {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is you name: ");
        String name = sc.nextLine();
        System.out.print("Where are you live? " + name + " : ");
        String adres = sc.nextLine();
        System.out.println();

        sc.close();

        System.out.println("Your name: " + name);
        System.out.println("Your adress: " + adres);



    }
}
