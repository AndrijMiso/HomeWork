package Intro7InterfaceExtendsOOP;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car();
        Car auto0 = new AudiA7();
        Car auto1 = new AudiR8();
        Car auto2 = new TeslaModelX();

        test(auto0);
        test(auto1);
        test(auto2);


        }
        public static void test(Car car) {
            car.runCar();
            car.motor();
            System.out.println("-----------------------------");
    }
}
