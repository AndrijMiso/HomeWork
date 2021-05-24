package homeWork007OOP2Interface.PracticalTask.Bird;

public class APP {
    public static void main(String[] args) {
        Bird bird0 = new Eagle();
        Bird bird1 = new Eagle();
        Bird swallow0 = new Swallow();
        Bird penguin0 = new Penguin();
        Bird chicken = new Chicken();

        Bird[] BirdArr = {bird0, bird1, swallow0, penguin0, chicken};

        for (int i = 0; i < BirdArr.length; i++) {
            BirdArr[i].fly();
            System.out.println(BirdArr[i]);
            System.out.println("---------------------");
        }
    }
}
