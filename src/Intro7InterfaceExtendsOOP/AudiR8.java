package Intro7InterfaceExtendsOOP;

public class AudiR8 extends Car {

    @Override
    public void runCar() {
        System.out.println("Автомобіль Audi R8 - їде ");
    }

    @Override
    public void motor() {
        System.out.println("Двигун у ауді Турбований");
    }
}
