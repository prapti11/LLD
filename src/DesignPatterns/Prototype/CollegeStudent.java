package DesignPatterns.Prototype;

public class CollegeStudent extends Student{

    private String aggregate;
    private String specialization;

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public CollegeStudent(){

    }
    public CollegeStudent(String aggregate, String specialization) {
        this.aggregate = aggregate;
        this.specialization = specialization;
    }

    public CollegeStudent(Student other, String aggregate, String specialization) {
        super(other);
        this.aggregate = aggregate;
        this.specialization = specialization;
    }

    public String getAggregate() {
        return aggregate;
    }

    public String getSpecialization() {
        return specialization;
    }
}
