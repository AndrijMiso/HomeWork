package homeWork007OOP2Interface.PracticalTask.Employee;

public abstract class Employee implements Payment {

    private String EmployeeId;

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }
}
