package DesignPatterns.Builder;

public class NewStudent {
    public static void main(String[] args) {
        StudentBuilder obj = new StudentBuilder();
        obj.setName("Prapti");
        obj.setAge(27);


        //Approach 1: If we will see StudentBuilder
        // is not exactly building Student class as we are creating its object directly
        //Solution to this is to create a build() method in Builder class
        //Student st = new Student(obj);

        Student s1=obj.build();
    }
}
