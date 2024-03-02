package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> b= new ArrayList<>();
        b.add("batch1");
        b.add("batch2");
        Instructor obj = new Instructor("Prapti", 11, "xyz@123",b,88.90);
    }
}
