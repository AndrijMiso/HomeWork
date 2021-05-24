package Intro3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuferRe {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("What is you name? ");
        String name = br.readLine();

        System.out.print("How old you: ");
        String old = br.readLine();
        System.out.println("---------Result---------");

        System.out.println("You name is: " + name);
        System.out.println("Your old: " + old);

    }
}
