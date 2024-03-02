package DesignPatterns.Builder;

public class Student {

    //We can add a static method to get the builder class without having to create its object
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    private String name;
    private int age;
    private boolean isStudent;
    private double psp;
    private String university;
    private int phone;
    private String email;

    Student (StudentBuilder sb){
        this.name = sb.getName();
        this.age = sb.getAge();
        this.isStudent = sb.isStudent();
        this.psp=sb.getPsp();
        this.university=sb.getUniversity();
        this.phone=sb.getPhone();
        this.email=sb.getEmail();


        //Before initializing the Student object -> do all the validations here

        if(age<0) throw new RuntimeException();
        if(psp<0 || psp>100) throw new RuntimeException();
    }

}
