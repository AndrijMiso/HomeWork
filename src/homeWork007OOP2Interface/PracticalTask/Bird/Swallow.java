package homeWork007OOP2Interface.PracticalTask.Bird;

public class Swallow extends FlyingBird {
    public Swallow() {
        setFeathers("Лагідне пірря");
        setLayEggs(false);
    }

    @Override
    public void fly() {
        System.out.println("Ластівка маленька і важко замітна");
    }

    @Override
    public String toString() {
        return "Ластівка [ піря - " + getFeathers() +", несе яйця - "+ isLayEggs()+ "]";
    }
}
