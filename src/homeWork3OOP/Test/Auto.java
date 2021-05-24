package homeWork3OOP.Test;

import java.util.Scanner;

public class Auto {
    private String marka, model;
    private int year;

    public Auto() {}

    public Auto(String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    int vikAvto() {
        return 2021 - year;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть характеристики авто:");
        System.out.print("Марка Автомобіля: ");
        marka = sc.nextLine();
        System.out.print("Модель Автомобіля: ");
        model = sc.nextLine();
        System.out.print("Рік Автомобіля: ");
        year = sc.nextInt();
        System.out.println("---------------------------------");
    }

    void output() {
        System.out.println("Характеристика авто:");
        System.out.println("Mарка Авто - " + marka);
        System.out.println("Модель Авто - " + model);
        System.out.println("Рік автомобілля - " + year);
        System.out.println("Вік автомобілля " + vikAvto());
        System.out.println("---------------------------------");
    }

    @Override
    public String toString() {
        return "Марка = " + marka + '\'' + ", Модель = " + model + '\'' + ", Рік Авто = " + year;
    }

    public static void main(String[] args) {
        Auto A1 = new Auto("Audi", "RS6", 2010);
        Auto A2 = new Auto("Telsa", "Model3", 2019);

        A1.output();
        A2.output();

        Auto A3 = new Auto();
        A3.input();
        Auto A4 = new Auto();
        A4.input();

        A3.output();
        A4.output();
    }
}
