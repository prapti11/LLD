package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService ex;
    Sorter(List<Integer> arr, ExecutorService ex){
        this.arrayToSort=arr;
        this.ex=ex;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;
        List<Integer> leftSortedArray = new ArrayList<>();
        List<Integer> rightSortedArray = new ArrayList<>();

        for(int i = 0;i<mid;i++){
            leftSortedArray.add(arrayToSort.get(i));
        }
        for(int i = mid;i<arrayToSort.size();i++){
            rightSortedArray.add(arrayToSort.get(i));
        }
        Sorter leftSorterArray = new Sorter(leftSortedArray,ex);
        Sorter rightSorterArray = new Sorter(rightSortedArray,ex);
        Future<List<Integer>> leftSortedFuture = ex.submit(leftSorterArray);
        Future<List<Integer>> rightSortedFuture = ex.submit(rightSorterArray);

        List<Integer> sortedLeft = leftSortedFuture.get();
        List<Integer> sortedRight = rightSortedFuture.get();

        int i = 0;
        int j = 0;
        List<Integer> sortedArray= new ArrayList<>();
        while(i<sortedLeft.size() && j<sortedRight.size()){
            if(sortedLeft.get(i)<=sortedRight.get(j)){
                sortedArray.add(sortedLeft.get(i));
                i++;
            }
            else{
                sortedArray.add(sortedRight.get(j));
                j++;
            }
        }
        while(i<sortedLeft.size()){
            sortedArray.add(sortedLeft.get(i));
            i++;
        }

        while(j<sortedRight.size()){
            sortedArray.add(sortedRight.get(j));
            j++;
        }
        return sortedArray;
    }
}
