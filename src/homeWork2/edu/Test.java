package homeWork2.edu;

public class Test {
    private String name;
    private int stavka;
    private int hours;
    private static int zarplatavsex = 0;

    public Test() {
    }

    public Test(String name, int stavka, int hours) {
        this.name = name;
        this.stavka = stavka;
        this.hours = hours;
        zarplatavsex = zarplatavsex + (stavka * hours);
    }

    @Override
    public String toString() {
        return "Імя = " + name + '\'' +
                ", Ставка в/годину = " + stavka +
                ", Години = " + hours;
    }

    void zarplata() {
        System.out.println("Зарплата працівника: " + name + " = " + stavka * hours);
    }

    /////////////////////////////////////////////
    public static void main(String[] args) {
        Test emp1 = new Test();
        Test emp2 = new Test("Andrej", 10, 12);
        Test emp3 = new Test("Pavlo", 9 , 10);
        Test emp4 = new Test("Maks", 150 , 3);

        System.out.println("Інформація про працівника - " + emp1);
        System.out.println("Інформація про працівника - " + emp2);
        System.out.println("Інформація про працівника - " + emp3);
        System.out.println("Інформація про працівника - " + emp4);

        emp2.zarplata();
        emp3.zarplata();
        emp4.zarplata();

        System.out.println("Зарплата усіх працівників " + zarplatavsex +  " UAH");



    }
}
