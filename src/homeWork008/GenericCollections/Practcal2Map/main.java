package homeWork008.GenericCollections.Practcal2Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Andrej");
        map.put(2, "Maks");
        map.put(3, "Pavlo");
        map.put(4, "Roman");
        map.put(5, "Zheka");
        map.put(6, "Ivan");
        System.out.println(map.entrySet());

        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        String value = sc.nextLine();
        String s1 = "";
        for (Map.Entry<Integer, String> arrEntry : map.entrySet()) {
            s1 = arrEntry.getValue();
            if (value.equals(s1)) {
                System.out.println("Знайдено такий value: ");
                System.out.println("[ key : " + arrEntry.getKey() + " value : " + arrEntry.getValue() + " ]");
                break;
            }
        }
        if (!value.equals(s1)) {
            System.out.println("Not a value. Try again");
        }

        //////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////



    }
}
