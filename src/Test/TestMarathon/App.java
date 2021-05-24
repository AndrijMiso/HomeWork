package Test.TestMarathon;

public class App {
    public static void main(String[] args) {
        Employe emp1 = new Employe();
        Employe emp2 = new Employe();

        emp1.fullName = "Andrej";
        emp1.salary = 110f;
        emp2.fullName = "MAks";
        emp2.salary = 100f;

        Employe[] employees = {emp1, emp2};
        String employeesInfo = "";
        for(Employe i: employees) {
            employeesInfo = employeesInfo + "{fullName: " + i.fullName + " salary: " + i.salary + "},";
        }
        employeesInfo = employeesInfo.replaceAll("[,]$", "");
        employeesInfo = "["+employeesInfo+"]";
        System.out.println(employeesInfo);



    }
}
