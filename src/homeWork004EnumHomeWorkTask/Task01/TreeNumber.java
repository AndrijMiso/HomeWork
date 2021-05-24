package homeWork004EnumHomeWorkTask.Task01;

import java.util.Scanner;

public class TreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        float q = sc.nextFloat();
        System.out.print("Введіть друге число: ");
        float a = sc.nextFloat();
        System.out.print("Введіть третє число: ");
        float z = sc.nextFloat();

        if ((q <= 5 && q >= -5 && a <= 5 && a >= -5 && z <= 5 && z >= -5)) {
            System.out.println("Число 1: " + q + " та число 2: " + a + " та число 3: " + z + " Належать до діапазону [-5,5]");
        } else {
            System.out.println("Числа не належать до діапазону [-5,5]");
        }
        int max = 0;
        int min = 0;
        if ((q > a && q > z && q % 1 == 0)) {
            max = (int) q;
        } else if ((a > q && a > z && a % 1 == 0)) {
            max = (int) a;
        } else if ((z > q && z > a && z % 1 == 0)) {
            max = (int) z;
        }

        if ((q < a && q < z && q % 1 == 0)) {
            min = (int) q;
        } else if ((a < q && a < z && a % 1 == 0)) {
            min = (int) a;
        } else if ((z < q && z < a && z % 1 == 0)) {
            min = (int) z;
        }
        System.out.println("Максимальне ціле число: " + max );
        System.out.println("Мінімальне ціле число: " + min);

        System.out.print("Введіть код помилки HTTP: ");
        int Error = sc.nextInt();
        switch (Error) {
            case 400 :
                System.out.println("Неправильний запит. Запит не може бути виконаний з причини невірного синтаксису.");
                break;
            case 401 :
                System.out.println("Несанкціонований доступ.");
                break;
            case 402 :
                System.out.println("Потрібна оплата. Зарезервовано для майбутнього використання.");
                break;
            case 404 :
                System.out.println("Не знайдено.");
                break;
            default:
                System.out.println("Щось пішло не так =(");
        }
        sc.close();
    }
}
