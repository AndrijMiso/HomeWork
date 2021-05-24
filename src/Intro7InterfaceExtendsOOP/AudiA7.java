package Intro7InterfaceExtendsOOP;

public class AudiA7 extends Car {

    @Override
    public void runCar() {
        System.out.println("Автомобіль Audi A7 - їде ");
    }

    @Override
    public void motor() {
        System.out.println("Двигун у ауді Дизельний");
    }
}
