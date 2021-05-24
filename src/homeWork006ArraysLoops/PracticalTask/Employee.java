package homeWork006ArraysLoops.PracticalTask;

import java.util.Scanner;

public class Employee {
    private String name;
    private int department_number;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Info Departament: " + department_number + " : " + name + " " + salary;
    }

    public static void main(String[] args) {
        Employee person1 = new Employee("Andrej", 10, 1000);
        Employee person2 = new Employee("Jek", 10, 600);
        Employee person3 = new Employee("Norman", 10, 2000);
        Employee person4 = new Employee("Maks", 10, 1500);
        Employee person5 = new Employee("Pavlo", 11, 999);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть номер департамента: ");
        switch (sc.nextInt()) {
            case 10:
                System.out.println(person1);
                System.out.println(person2);
                System.out.println(person3);
                System.out.println(person4);
                break;
            case 11:
                System.out.println(person5);
                break;
            default:
                System.out.println("Ви ввели номер неіснуйочого департаменту");
        }
        sc.close();
        Employee[] a = new Employee[5];
        a[0] = person1;
        a[1] = person2;
        a[2] = person3;
        a[3] = person4;
        a[4] = person5;

        Employee tmp = new Employee();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].getSalary() < a[j + 1].getSalary()) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorting by sallary: ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}

