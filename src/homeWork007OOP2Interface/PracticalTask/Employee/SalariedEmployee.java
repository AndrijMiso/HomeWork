package homeWork007OOP2Interface.PracticalTask.Employee;

public class SalariedEmployee extends Employee {

    private double hourlyPay;
    private double hourlyWork;
    private String socialSecurityNumber;

    public SalariedEmployee(String getEmployeeId ,String socialSecurityNumber, double hourlyPay, double hourlyWork) {
        this.hourlyPay = hourlyPay;
        this.hourlyWork = hourlyWork;
        this.socialSecurityNumber = socialSecurityNumber;
        super.setEmployeeId(getEmployeeId);
    }

    @Override
    public double calculatePay() {
        return hourlyPay * hourlyWork;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                " EmployeeId " + super.getEmployeeId() +
                " hourlyPay= " + hourlyPay +
                ", hourlyWork= " + hourlyWork +
                ", socialSecurityNumber= '" + socialSecurityNumber + '\'' +
                '}';
    }
}
