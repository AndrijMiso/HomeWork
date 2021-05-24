package homeWork004EnumHomeWorkTask.EnumError1;

import java.util.Scanner;

enum Error {
    _401("Помилка чотириста перша"),
    _402("Помилка чотириста dryga");

    private String Opus;

    Error(String opus) {
        Opus = opus;
    }

    @Override
    public String toString() {
        return Opus;
    }
}

public class HttpError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть код помилки:");
        String http = sc.nextLine();
        switch (http) {
            case "_401":
                System.out.println(Error._401);
                break;
            case "_402":
                System.out.println(Error._402);
                break;
        }
    }
}
