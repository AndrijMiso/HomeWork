package homeWork008.GenericCollections;

import java.util.*;
import java.util.ArrayList;

public class intt {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int s = sc.nextInt();
            myCollection.add(s);
        }

        System.out.println("My start collections int 10 = " + myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (Integer arr : myCollection) {
            if (arr > 5) {
                newCollection.add(arr);
            }
        }
        System.out.println("My end collections int 5 < arr = " + newCollection);
        System.out.println("------------------------------------------------------------");
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() > 20 ) {
                iterator.remove();
            }
        }
        System.out.println("My eng collections (iterator) remove > 20 " + myCollection);
        System.out.println("------------------------------------------------------------");
    }
}
