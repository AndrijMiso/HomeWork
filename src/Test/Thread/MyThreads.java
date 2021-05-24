package Test.Thread;

public class MyThreads extends Thread {
    public void run(){
        for(int i  = 0; i < 1000; i++) {
            System.out.println("My new Throuds");
        }
    }

}
