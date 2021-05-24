package Intro7InterfaceExtendsOOP;

public class TeslaModelX extends Car {

    @Override
    public void runCar() {
        System.out.println("Автомобіль TeslaModelX - їде ");
    }

    @Override
    public void motor() {
        System.out.println("Двигун у тесли Електричний");
    }
}
