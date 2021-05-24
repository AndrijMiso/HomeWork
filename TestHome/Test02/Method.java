package Test02;

public class Method {
//    int a = 100, b = 200, c = 300;

    public static void main(String[] args) {
        Method Test = new Method();
        Test.Sum(100, 200, 300);
        Test.Mno(10, 10, 100);
        Test.Vid(1000, 998, 1);
        bigTre(100,200,300);

    }

    public void Sum(int a, int e, int d) {
        int res = a + e + d;
        System.out.println("Додавання елементів: " + res);
    }

    public void Mno(int r, int t, int c) {
        int res = r * t * c;
        System.out.println("Множення елементів: " + res);
    }

    public void Vid(int q, int w, int y) {
        int res = q - w - y;
        System.out.println("Віднімання елементів: " + res);
    }

    static void bigTre (int p, int o, int r) {
        int res = (p - o + r);
        System.out.println("Віднімання елементів + додавання : " + res);
    }
}
