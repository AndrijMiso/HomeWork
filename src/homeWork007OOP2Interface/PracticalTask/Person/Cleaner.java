package homeWork007OOP2Interface.PracticalTask.Person;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Teachers :";

    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println(TYPE_PERSON);
        System.out.println("\tMy name is " + getName());
    }

    @Override
    public void salary() {
        System.out.println("\t\tЗарплата У " + getName() + " : " + getSalary() + " $");
    }
}
