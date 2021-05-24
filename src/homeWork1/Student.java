package homeWork1;

public class Student {
    // Наші приватні поля
    private String name;
    private float rating;
    // наше статичне поле (Середній рейтинг)
    static float avgRating;
    

    // Конструткор за замовчуванням
    public Student() {
        name = "";
        rating = 0;
    }

    // Конструктор з двома нашими параметрами)
    public Student(String name, float rating) {
        this.name = name;
        this.rating = rating;
        avgRating = avgRating + rating;
    }

    //Methods (Середній рейтинг)
    public float getAvrRating() {
        avgRating = avgRating / 3;
        return avgRating;
    }

    public boolean betterStudent(Student a, Student b) {
        return (a.rating > b.rating);
    }

    @Override
    public String toString() {
        return "Імя студента - " + name + ", Його рейтинг - " + rating;
    }



    ////////////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        Student st1 = new Student("andrik" , 5.1f);
        Student st2 = new Student("Pavlo" , 5.6f);
        Student st3 = new Student("Maks", 9.0f);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
        System.out.println("Студент st1 краще студента st2 - " + st1.betterStudent(st3, st2));
        System.out.println("Середній рейтинг- " + st2.getAvrRating());

    }


}
