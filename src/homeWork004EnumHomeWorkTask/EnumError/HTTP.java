package homeWork004EnumHomeWorkTask.EnumError;

enum Error {
    ERROR401, ERROR402, ERROR403, ERROR404
}

public class HTTP {
    public static void main(String[] args) {
        Error error = Error.ERROR403;
        switch (error) {
            case ERROR401:
                System.out.println("401 Unauthorized — Несанкціонований доступ"); break;
            case ERROR402:
                System.out.println("402 Payment Required — Потрібна оплата."); break;
            case ERROR403:
                System.out.println("403 Forbidden — Заборонено."); break;
            case ERROR404:
                System.out.println("404 Not Found — Не знайдено."); break;
            default:
                System.out.println("Щось пішло не так =(");
        }
    }
}
