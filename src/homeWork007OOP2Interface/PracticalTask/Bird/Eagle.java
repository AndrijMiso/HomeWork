package homeWork007OOP2Interface.PracticalTask.Bird;

public class Eagle extends FlyingBird {

    public Eagle() {
        setFeathers("Aerodinamic Feathers");
        setLayEggs(true);
    }


    public void fly() {
        System.out.println("Орел летить високо і далеко ");
    }

    @Override
    public String toString() {
        return "Орел [ піря - " + getFeathers() +", несе яйця - "+ isLayEggs()+ "]";
    }
}
