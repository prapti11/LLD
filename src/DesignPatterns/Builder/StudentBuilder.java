package DesignPatterns.Builder;

//This class has only one responsibility and tha is to help create a Student class

public class StudentBuilder {

    public Student build(){
        return new Student(this);
    }
    // Private attributes, making them immutable
    private String name;
    private int age;
    private boolean isStudent;
    private double psp;
    private String university;
    //Pros of using getters and setters:
    //1. You can control the visibility of the attributes
    //2. You can monitor what all attributes are getting called and by whom
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int phone;
    private String email;
}
