package homeWork007OOP2Interface.PracticalTask;

public class Test {
    public static void main(String[] args) {
    Animal cat0 = new Cat("Myrka");
    Animal cat1 = new Cat("Lisi4ka");

    Animal dog0 = new Dog("Bobik");
    Animal dog1 = new Dog("Jek");

    Animal[] arr = { cat0, cat1, dog0, dog1 };

        for (Animal i: arr) {
            test(i);
        }


    }

    public static void test(Animal animal) {
        animal.voice();
        animal.feed();
        System.out.println("----------------------");
    }
}
