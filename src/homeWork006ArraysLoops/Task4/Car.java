package homeWork006ArraysLoops.Task4;

import java.util.Scanner;

public class Car {
    private String name;
    private String model;
    private int year;
    private float capacity;

    public Car() {}

    public Car(String name, String model, int year, float capacity) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car [name = " + name + ", model = " + model + ", year = " + year + ", capacity = " + capacity + "]";
    }

    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A6", 2010, 2.0f);
        Car c2 = new Car("Chevrolet", "Epica", 2010, 2.0f);
        Car c3 = new Car("BMW", "F15", 2007,4.4f);
        Car c4 = new Car("Ford" ,"Fusion", 2007, 2.5f);

        System.out.println("Масив з автомобілів");
        Car[] cars = {c1, c2, c3, c4} ;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("Введіть рік - щоб отримати всі авто цього року :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isCars = false;
        for (int i = 0; i < cars.length; i++) {
            if (year == cars[i].getYear()) {
                System.out.println(cars[i]);
                isCars = true;
            }
        }
        if (!isCars) {
            System.out.println("Немає таких авто");
        }
        System.out.println("-----------------------------");
        // by Sorting
        Car tmp = new Car();
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = 0; j < cars.length-1-i; j++) {
                if(cars[j].getYear() > cars[j+1].getYear()) {
                    tmp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
