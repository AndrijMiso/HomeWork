package Intro7InterfaceExtendsOOP;

public class Car implements Engine {
    public void runCar() {
        System.out.println("Авто Їде");
    }

    @Override
    public void motor() {
        System.out.println("Це повідомлення у машині");
    }
}
