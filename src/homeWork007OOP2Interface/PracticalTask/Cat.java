package homeWork007OOP2Interface.PracticalTask;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " Mrrrrrrrr--Mrrrrrr");
    }

    @Override
    public void feed() {
        System.out.println(name + " Cat is feed");
    }
}
