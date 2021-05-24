package Test.Thread;

public class App {
    public static void main(String[] args) {
        System.out.println("Start Thread Main");
        MyThreads myThreads = new MyThreads() ;
        myThreads.start();
        System.out.println("End Thread Main");
    }
}
