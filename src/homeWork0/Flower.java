package homeWork0;

import java.util.Scanner;

public class Flower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius: " );
        int radius = sc.nextInt();
        int S = (int) (Math.PI * radius * radius);
        int P = (int) (2 * Math.PI * radius);
        sc.close();

        System.out.println("Perumetr kola: " + P);
        System.out.println("Ploscha kola: " + S);
    }
}
