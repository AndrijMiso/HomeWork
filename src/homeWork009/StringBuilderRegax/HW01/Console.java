package homeWork009.StringBuilderRegax.HW01;

import homeWork009.StringBuilderRegax.Str;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input of five words: ");
        String str = sc.nextLine();
        System.out.println("Найдовше слово у реченні: ");
        String[] arrNew = str.split(" ");
        String bigLength = "";
        for (int i = 0 ; i < arrNew.length-1 ; i++) {
            if (arrNew[i].length() > arrNew[i+1].length()) {
                bigLength = arrNew[i];
            } else {
                bigLength = arrNew[i+1];
            }
        }
        System.out.println(bigLength);
        ///////////////////////////////////////////
        /////визначити кількість його букв/////////
        ///////////////////////////////////////////
        System.out.print("Визначити кількість його букв: ");
        System.out.println(bigLength.length());

        //////////////////////////////////////////////////////
        /////привести друге слово у зворотному порядку/////////
        ///////////////////////////////////////////////////////
        System.out.print("Привести друге слово у зворотному порядку: ");
        String reverce = "";
        for( int i = arrNew[1].length()-1; i >= 0 ; i--) {
            reverce = reverce + arrNew[1].charAt(i);
        }
        System.out.println(reverce);


    }
}
