package Intro2;

public class Person {
    int height;     ///Переменая під назвою висота
    float weight;   ///Переменая під назвою вага

    Person(int height, float weight) { // Конструктор який приймає два параметра)
        this.height = height;
        this.weight = weight;
    }

    Person() {} // Конструктор за замовчуванням
}
