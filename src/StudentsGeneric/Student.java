package StudentsGeneric;

public class Student <T1, T2> {
    private T1 name;
    private T2 age;

    public Student(T1 name, T2 age) {
        this.name = name;
        this.age = age;
    }

    public T1 getName() {
        return name;
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public T2 getAge() {
        return age;
    }

    public void setAge(T2 age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
