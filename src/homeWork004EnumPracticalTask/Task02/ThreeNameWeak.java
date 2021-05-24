package homeWork004EnumPracticalTask.Task02;

import java.util.Scanner;

public class ThreeNameWeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число тижня: (1-7) : ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Понеділок");
                System.out.println("Понедельник");
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Вівторок");
                System.out.println("Вторник");
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Середа");
                System.out.println("Среда");
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Четвер");
                System.out.println("Четверг");
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Пятниця");
                System.out.println("Пятница");
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Субота");
                System.out.println("Суббота");
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Неділя");
                System.out.println("воскресенье");
                System.out.println("sunday");
                break;
            default:
                System.out.println("Неправильне число тижня!");
        }
        sc.close();
    }
}
