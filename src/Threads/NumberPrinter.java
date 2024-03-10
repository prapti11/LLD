package Threads;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x ==1){
            for(int i = 1;i<=100;i++){
                NumberPrinterRunnable r=new NumberPrinterRunnable(i);
                Thread t = new Thread(r);
                t.start();
            }
        }
        else if(x==2){
            ExecutorService es = Executors.newFixedThreadPool(10);
            for(int i = 1;i<=100;i++){
                NumberPrinterRunnable r=new NumberPrinterRunnable(i);
                es.execute(r);
            }
        }


    }
}
