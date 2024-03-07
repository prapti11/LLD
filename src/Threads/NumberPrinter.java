package Threads;

public class NumberPrinter {
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++){
            NumberPrinterRunnable r=new NumberPrinterRunnable(i);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
