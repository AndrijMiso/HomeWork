package homeWork007OOP2Interface.PracticalTask.Bird;

public class Penguin extends NoFlyingBird {
    public Penguin() {
        setFeathers("Немає");
        setLayEggs(true);
    }

    @Override
    public void fly() {
        System.out.println("Пінгвіни літають лише по льоді =)");
    }

    @Override
    public String toString() {
        return "Пінгвін [ піря - " + getFeathers() +", несе яйця - "+ isLayEggs()+ "]";
    }
}
