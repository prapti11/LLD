package DesignPatterns.Prototype;

public class ProfessionalStudent extends Student{
    private String company;
    private int salary;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
