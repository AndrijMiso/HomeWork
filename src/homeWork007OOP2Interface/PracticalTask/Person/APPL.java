package homeWork007OOP2Interface.PracticalTask.Person;

public class APPL {
    public static void main(String[] args) {
        Person st = new Student("Andrej");
        Person st1 = new Student("Reks");
        Staff te = new Teachers("Roman", 500);
        Staff te1 = new Teachers("Petrovuch", 600);
        Cleaner cl = new Cleaner("Ivanivna", 70);
        Staff cl1 = new Cleaner("Romanivna", 100);




        Person[] arr = {st, st1, te, te1, cl, cl1};

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
            if(arr[i] instanceof Staff) {
                ((Staff) arr[i]).salary();
            }
        }



    }
}
