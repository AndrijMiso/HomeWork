package homeWork004EnumHomeWorkTask.dog;

enum FieldDog {
    HORT, LAVRETKA, SALYUK, HONCHI
}

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jeak", "Shepherd", 6);
        Dog dog2 = new Dog("Pet", "Hort", 10);
        Dog dog3 = new Dog("Jeak1", "Honchi", 2);

        if (dog1.name == dog2.name || dog1.name == dog3.name || dog2.name == dog3.name) {
            System.out.println("Є дві собаки з одинаковими іменами");
        } else {
            System.out.println("Немає собак з одинаковими іменами");
        }
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
