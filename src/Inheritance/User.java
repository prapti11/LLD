package Inheritance;

public class User {
    String name;
    int id;
    private String password;

    public User(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        System.out.println("Parent constructor is called");
    }
}
