package homeWork008.GenericCollections.Collections.Train;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Student {

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }







    /////////////////////////////////////////////////////////////////
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> student, int course) {
        System.out.println(student);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
