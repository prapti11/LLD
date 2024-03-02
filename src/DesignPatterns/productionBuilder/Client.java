package DesignPatterns.productionBuilder;


public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Prapti").setAge(27).build();
    }
}
