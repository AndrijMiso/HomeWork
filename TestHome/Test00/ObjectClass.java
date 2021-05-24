package Test00;

public class ObjectClass {

    public static void main(String[] args) {

        Automobile Avto1 = new Automobile();
        Avto1.Marka = "Audi";
        Avto1.Model = "A6 C6";
        Avto1.Year = 2010;
        System.out.println("Обєкт класу Auto1 :" + Avto1.Marka + " " + Avto1.Model + "" + Avto1.Year);

        Automobile Avto3 = new Automobile("Mersedes" ,"C 63", 2020 );
        System.out.println("Обєкт класу Auto3 :" + Avto3.Marka + " " + Avto3.Model + " " + Avto3.Year);

///        Automobile Avto2 = new Automobile();
///        Avto1.Marka = "Mersedes";
///        Avto1.Model = "C 63";
///        Avto1.Year = 2020;
///        System.out.println("Обєкт класу Auto2 :" + Avto2.Marka + " " + Avto2.Model + "" + Avto2.Year);
    }
}