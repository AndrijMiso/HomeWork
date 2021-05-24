package StudentsGeneric;

public class App {
    public static void main(String[] args) {
        Student<String, Integer> st1 = new Student<>("Andrej", 22 );
        System.out.println(st1);
        Student<String, Integer> st2 = new Student<>("Pavlo",199);
        System.out.println(st2);
        System.out.println(st2.getAge());
    }
}
