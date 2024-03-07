package Threads;

public class Main {
    public static void main(String[] args) {
        // By default, Main Thread will be used to execute the code
        System.out.println("Hello World from " + Thread.currentThread().getName());
        NewThread newThread = new NewThread();
        Thread t1 = new Thread(newThread);
        t1.start();

        System.out.println("Run by Main thread");
    }
}
