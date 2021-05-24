package homeWork007OOP2Interface.PracticalTask.Person;

public class Student extends Person {
    private final String TYPE_PERSON = "Student :";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(TYPE_PERSON);
        System.out.println("\tMy name is " + getName());
    }
}
