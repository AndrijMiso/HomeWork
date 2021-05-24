package homeWork007OOP2Interface.PracticalTask.Employee;

public class ContractEmployee extends Employee implements Payment {
    private double monthlyPay;

    public ContractEmployee(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    @Override
    public double calculatePay() {
        return monthlyPay;
    }
}
