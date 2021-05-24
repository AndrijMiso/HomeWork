package homeWork007OOP2Interface.PracticalTask.Employee;

public class APP {
    public static void main(String[] args) {
        Employee vova = new SalariedEmployee("20:ID", "Nitgh", 100, 8);
        System.out.println(vova);
        System.out.println(vova.calculatePay());
    }
}
