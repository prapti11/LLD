package DesignPatterns.Prototype;

public class Client {

    public static void main(String[] args) {

    }

    public static void fillRegistry(Registry<Student> register){
        Student st = new Student();
        st.setName("Prapti");
        st.setPsp(90);
        register.register("AprilBatch",st);

        CollegeStudent ct = new CollegeStudent();
        ct.setName("Kittu");
        ct.setPsp(99);
        ct.setAggregate("8.3");
        ct.setSpecialization("CS");
        register.register("College",ct);

        ProfessionalStudent pt = new ProfessionalStudent();
        pt.setName("Saloni");
        pt.setPsp(100);
        pt.setCompany("Google");
        pt.setSalary(90000);
        register.register("Pro",pt);
    }
}
