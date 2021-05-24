package homeWork2;

/**
 * Створіть проект консольної програми на Java.
 * Додайте клас «Співробітник» до проекту.
 * Працівник класу повинен складатися з
 * три приватні поля: назва, тариф і години;
 * статичне поле totalSum
 * властивості для доступу до цих полів;
 * конструктор за замовчуванням, конструктор з 2 параметрами (ім'я та швидкість) та конструктор з 3 параметрами;
 * методи:
 * getSalary () - для обчислення заробітної плати людини (ставка * години)
 * toString () - для виведення інформації про працівника
 * changeRate (int rate) - для зміни ставки деякого працівника та перерахунку його зарплати
 * getBonuses () - для обчислення 10% від зарплати
 * У методі main () створіть 3 об'єкти типу Employee. Введіть інформацію про них.
 * Відобразіть загальну заробітну плату всіх робітників на екран
 */

public class Employee {
    //Наші 3 приватні поля (імя, ставка, години)
    private String name;
    private double rate;
    private double hours;

    // Статичне поле
    private static double totalSum;

    //Доступих до наших полів через гетери і сетери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    //Наші конструктори класу
    public Employee() {
    }
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        totalSum = totalSum + rate * hours;
    }
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + rate * hours;
    }

    //Наші методи в класі Employee
    public void getSalary() {
        System.out.println("Заробітня плата :" + (rate * hours));
    }
    @Override
    public String toString() {
        return "Працівник - " +
                "Імя " + name + '\'' +
                ", Ставка = " + rate +
                ", Години = " + hours;
    }
    public void changeRate(double rate) {
        this.rate = rate;
    }
    public double getBonuses() {
        return 0.1 * rate * hours;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ivan", 100);
        Employee emp3 = new Employee("Petro", 200,8);
        Employee emp4 = new Employee("Pavlo", 100,8);

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);
        System.out.println("Employee 3: " + emp3);

        System.out.println("TotalSum: " + totalSum);
    }
}
