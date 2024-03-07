package Threads;

public class NumberPrinterRunnable implements Runnable{
    int i;
    NumberPrinterRunnable(int i){
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println(i+" from " + Thread.currentThread().getName());
    }
}
