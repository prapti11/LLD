package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);
        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter task = new Sorter(arr,ex);
        Future<List<Integer>> arrFuture = ex.submit(task);
        List<Integer> output = arrFuture.get();
        System.out.println(output);

    }
}
