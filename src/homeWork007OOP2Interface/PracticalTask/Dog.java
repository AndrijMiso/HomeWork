package homeWork007OOP2Interface.PracticalTask;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " Gav-Gav-Gav");
    }

    @Override
    public void feed() {
        System.out.println(name + " Dog is feed");
    }
}
