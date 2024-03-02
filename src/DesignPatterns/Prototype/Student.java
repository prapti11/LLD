package DesignPatterns.Prototype;

public class Student {
    private String name;
    private int age;
    private boolean isStudent;
    private double psp;
    private String university;
    private int phone;
    private String email;

    Student() {
    }

    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.isStudent = other.isStudent;
        this.psp = other.psp;
        this.university = other.university;
        this.phone = other.phone;
        this.email = other.email;
    }

    public Student clone(){
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversity() {
        return university;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
