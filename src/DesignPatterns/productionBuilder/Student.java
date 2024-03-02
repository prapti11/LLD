package DesignPatterns.productionBuilder;

public class Student {
    private String name;
    private int age;
    private boolean isStudent;
    private double psp;
    private String university;
    private int phone;
    private String email;

    private Student(Builder b) {
        this.name = b.getName();
        this.age = b.getAge();
        this.isStudent = b.isStudent();
        this.psp = b.getPsp();
        this.university = b.getUniversity();
        this.phone = b.getPhone();
        this.email = b.getEmail();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    // We will create the Builder of this class as the inner class itself

    public static class Builder{
        private String name;
        private int age;
        private boolean isStudent;
        private double psp;
        private String university;
        private int phone;
        private String email;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setStudent(boolean student) {
            this.isStudent = student;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
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

        public Student build(){
            return new Student(this);
        }
    }
}
