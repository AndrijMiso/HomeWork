package homeWork007OOP2Interface.PracticalTask.Bird;

public class Chicken extends NoFlyingBird{
    public Chicken() {
        setFeathers("Різнокольорове");
        setLayEggs(true);
    }

    @Override
    public void fly() {
        System.out.println("Курка не літа, вона швидко бігає");
    }

    @Override
    public String toString() {
        return "Курка [ піря - " + getFeathers() +", несе яйця - "+ isLayEggs()+ "]";
    }
}
