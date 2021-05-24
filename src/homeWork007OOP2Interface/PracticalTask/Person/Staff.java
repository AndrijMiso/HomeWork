package homeWork007OOP2Interface.PracticalTask.Person;

public abstract class Staff extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public abstract void salary();
}
