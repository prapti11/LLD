package Inheritance;

import java.util.List;

public class Instructor extends User{
   List<String> batches;
   double avgRating;

    public Instructor(String name, int id, String password, List<String> batches, double avgRating) {
        super(name, id, password);
        this.batches = batches;
        this.avgRating = avgRating;
        System.out.println("Child class constructor called");
    }
}
