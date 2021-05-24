package Intro0;

public class MethodSum {

    public static void main(String[] args) {
///	    int a=10, b=20;
///	    System.out.println("Програма бачить число 10 і 20");
///     System.out.println(sum(10, 30));
        MethodSum.sum(10, 30);
        concat(100, 200);
        MethodSum qwerty = new MethodSum();
        qwerty.dilenya(3000, 10);
        qwerty.vidnimanya(600, -900);
        sum(131, 131);

    }

    public static void sum(int a, int b) {
        int c = a * b;
        System.out.println("Множення = " + c);
    }

    public static void concat(int a, int b) {
        int c = a + b;
        System.out.println("Додавання = " + c);
    }

    public void dilenya(int a, int b) {
        int c = a / b;
        System.out.println("Ділення = " + c);
    }

    public void vidnimanya(int a, int b) {
        int c = (a + b);
        System.out.println("Віднімання = " + c);
    }
}
